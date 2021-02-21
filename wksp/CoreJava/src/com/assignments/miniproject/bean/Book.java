package com.assignments.miniproject.bean;

public class Book extends MediaItem{
    private String author;

    public Book() {
        super();
    }

    public Book(int id, String title, double price, int year, String author) {
        super(id, title, price, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + super.toString() +
                " author='" + author + '\''
                ;
    }
}
