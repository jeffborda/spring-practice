package com.jeffborda.springpractice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    public String title;
    public String artist;
    public int songCount;
    public int lengthInSeconds;
    public String imageUrl;

    public Album() { }

    public Album(String title, String artist, int songCount, int lengthInSeconds, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Album ID: " + id + ", Title: " + title + ", Artist: " + artist + ", Song Count: " + songCount + ", Length (in sec): " + lengthInSeconds + ", image URL: " + imageUrl;
    }

}
