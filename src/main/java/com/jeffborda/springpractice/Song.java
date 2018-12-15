package com.jeffborda.springpractice;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    public String title;
    public int length;
    public int trackNumber;

    @ManyToOne
    public Album album;

    public Song() {}

    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    @Override
    public String toString() {
        return "Song Title: " + title + " | Length: " + length + " | Track Number: " + trackNumber + " | Album: " + album.title;
    }
}
