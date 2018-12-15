package com.jeffborda.springpractice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.net.MalformedURLException;
import java.net.URL;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;
    @Autowired
    private SongRepository songRepo;

    @RequestMapping(value="/albums", method=RequestMethod.GET)
    public String index(Model m) {
        // Get all albums from the database
        albumRepo.findAll();
        // Display albums to the page
        m.addAttribute("albums", albumRepo.findAll());
        return "albums-index";
    }

    @RequestMapping(value="/albums", method=RequestMethod.POST)
    public RedirectView create(
            @RequestParam String title,
            @RequestParam String artist,
            @RequestParam int song_count,
            @RequestParam int length,
            @RequestParam String image_url) {
        Album newAlbum = new Album(title, artist, song_count, length, image_url);
        albumRepo.save(newAlbum);

        return new RedirectView("/albums");
    }

    @RequestMapping(value="/albums/{albumId}", method=RequestMethod.GET)
    public String show(@PathVariable long albumId, Model m) {
        m.addAttribute("album", albumRepo.findById(albumId).get());
        return "albums-show";
    }

    @RequestMapping(value="/albums/{albumId}/songs", method=RequestMethod.POST)
    public RedirectView addSong(@PathVariable long albumId,
                               @RequestParam String title,
                               @RequestParam int length,
                               @RequestParam int track_number) {
        Song newSong = new Song(title, length, track_number);
        newSong.album = albumRepo.findById(albumId).get();
        songRepo.save(newSong);
        return new RedirectView("/albums/{albumId}");
    }

}
