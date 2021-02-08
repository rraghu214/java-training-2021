package com.assignments.A3.MiniProject.bean;

public abstract class MediaItem {
    private int id;
    private String title;
    private double price;
    private int year;

    public MediaItem() {
    }

    public MediaItem(int id, String title, double price, int year) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MediaItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
