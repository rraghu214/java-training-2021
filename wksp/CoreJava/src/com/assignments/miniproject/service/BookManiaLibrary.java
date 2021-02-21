package com.assignments.miniproject.service;

import com.assignments.miniproject.bean.Audio;
import com.assignments.miniproject.bean.Book;
import com.assignments.miniproject.bean.MediaItem;
import com.assignments.miniproject.exception.ItemException;

import java.util.ArrayList;

public class BookManiaLibrary implements Library {
    ArrayList <MediaItem> items = new ArrayList<>();

    //•	Constructor to initialize array with 1 book and 1 audio object
    public BookManiaLibrary() {
        items.add(new Book(232,"Mahabaratha",999,2010,"Bibek Debroy"));
        items.add(new Audio(1232,"Vande Mataram",100,2000,"AR Rahaman"));
    }

    //Method 1: Add Item
    public void addItem(MediaItem item){
        items.add(item);
//        System.out.println("Class Name : " + item.getClass() );
//        String val = item.getClass().toString();
//        System.out.println("Value is : "+val);
//        System.out.println(val.contains("Audio"));
//        System.out.println(item);
//        System.out.println("Artist is : " + ((Audio)item).getArtist());
    }

    //Method 2: Search Item By ID
    public boolean searchItemById(int id){
        for (MediaItem item : items){
            if(item.getId()==id) {
                System.out.println("Exists");
                return true;
            }
        }
        throw new ItemException();
    }

    //Method 3: Get All Items
    public ArrayList<MediaItem> getItems(){
        return this.items;
    }

    //Method 4: Update an Item
    public MediaItem updateItem(MediaItem item){
        for (int i = 0; i < items.size();i++){
            if(items.get(i).getId() == item.getId()){
                items.set(i,item);
                return item;
            }
        }
        throw new ItemException("Unable to update since the item does not exist!");
    }

    //Method 5: Delete an Item
    public boolean deleteItem(int id){
        for(int i = 0;i<items.size();i++){
            if(items.get(i).getId() == id){
                items.remove(i);
                return true;
            }
        }
        throw new ItemException("Unable to delete since the item does not exist!");
    }
}
