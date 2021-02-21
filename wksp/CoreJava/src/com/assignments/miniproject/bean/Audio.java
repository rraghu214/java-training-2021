package com.assignments.miniproject.bean;

public class Audio extends MediaItem{
    private String artist;

    public Audio() {
        super();
    }

    public Audio(int id, String title, double price, int year, String artist) {
        super(id, title, price, year);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Book: " + super.toString() +
                " artist='" + artist + '\''
                ;
    }
}
