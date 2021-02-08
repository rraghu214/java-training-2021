package com.assignments.A3.MiniProject.service;

import com.assignments.A3.MiniProject.bean.Audio;
import com.assignments.A3.MiniProject.bean.Book;

public class BookManiaLibrary {
    private String [] MediaItem;

    public BookManiaLibrary(String[] mediaItem) {
        Book b1 = new Book(123,"ABC",12.00,1989,"Raghu");
        Audio a1 = new Audio(456,"DEF",92.00,1999,"Uhgar");

        //this.MediaItem[0] = "book1";
    }
}
