package com.jeffborda.springpractice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.MalformedURLException;
import java.net.URL;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;

    @RequestMapping(value="/albums", method= RequestMethod.GET)
    public String index(Model m) throws MalformedURLException {
        // Get all albums from the database
//        Album[] albums = new Album[]{
//               new Album("Siamese Dream", "Smashing Pumpkins", 14, 3650, "https://upload.wikimedia.org/wikipedia/en/4/44/SmashingPumpkins-SiameseDream.jpg"),
//                new Album("Dolls of Highland", "Kyle Craft", 13, 3555,"https://upload.wikimedia.org/wikipedia/en/7/7f/Kyle_Craft_-_Dolls_of_Highland.jpg")
//        };

        albumRepo.findAll();

        // Display albums to the page
        m.addAttribute("albums", albumRepo.findAll());

        return "albums-index";
    }
}
