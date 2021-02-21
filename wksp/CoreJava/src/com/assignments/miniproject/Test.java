package com.assignments.miniproject;

import com.assignments.miniproject.bean.Audio;
import com.assignments.miniproject.bean.Book;
import com.assignments.miniproject.bean.MediaItem;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<MediaItem> items = new ArrayList<>();

        items.add(new Book(232,"Mahabaratha",999,2010,"Bibek Debroy"));
        items.add(new Audio(1232,"Vande Mataram",100,2000,"AR Rahaman"));

        for (MediaItem item : items)
            System.out.println(item);

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String title = sc.next();
        double price = sc.nextDouble();
        int yr = sc.nextInt();
        String author = sc.next();

        items.add(new Book(id,title,price,yr,author));
        for (MediaItem item : items)
            System.out.println(item);

        int search_id = 75;
        for (MediaItem item : items)
            if(item.getId() == search_id)
                System.out.println("ID Exists. Object details : " + item);
    }
}
