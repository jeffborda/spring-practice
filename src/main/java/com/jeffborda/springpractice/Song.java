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
    public String album;

    @ManyToOne
    public Album albumPointer;

    public Song() {}

    public Song(String title, int length, int trackNumber, String album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", length=" + length +
                ", trackNumber=" + trackNumber +
                ", album='" + album + '\'' +
                '}';
    }
}
