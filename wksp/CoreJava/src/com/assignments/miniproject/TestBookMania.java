package com.assignments.miniproject;

import com.assignments.miniproject.bean.Audio;
import com.assignments.miniproject.service.BookManiaLibrary;

public class TestBookMania {

    public static void main(String[] args) {
        BookManiaLibrary b1 = new BookManiaLibrary();
        int id = 1225;
        String title = "My Journey";
        double price = 1232.50;
        int year = 1999;
        String auth = "Tom";

        b1.addItem(new Audio(id,title,price,year,auth));

        System.out.println("ID Exists??? " + b1.searchItemById(232));

        System.out.println(b1.getItems());

        for (int i = 0; i < b1.getItems().size(); i++)
        {
            System.out.println("Fetching Item # "+ i + " --> " + b1.getItems().get(i));
        }

        // Update Item

        System.out.println(b1.updateItem(new Audio(1226,"Your Journey",232.50,1999,"Tom")));

        System.out.println(b1.deleteItem(1226));

        System.out.println(b1.getItems());
    }
}
