package com.learning.jan._18.oops.inheritance;

public class Book extends Item{
    private String title;


    @Override
    public void calculatePrice() {
        System.out.println("Price of the Book!");
    }

    public Book() {
        super("","");
        System.out.println("Book def constructor");
    }

    public Book(String id, String desc,String title) {
        super(id, desc);
        System.out.println("Book param constructor");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
