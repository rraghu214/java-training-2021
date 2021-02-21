package com.assignments.miniproject.ui;

import com.assignments.miniproject.bean.Audio;
import com.assignments.miniproject.bean.Book;
import com.assignments.miniproject.bean.MediaItem;
import com.assignments.miniproject.dao.MediaItemDao;
import com.assignments.miniproject.service.BookManiaLibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean exit_status = false;
        BookManiaLibrary b1 = new BookManiaLibrary();
        MediaItemDao mid = new MediaItemDao();

        while(exit_status == false) {
            System.out.println("\n\nChoose your Option :\n1. Insert Details\n2. Search Item By ID\n3. Update Item\n" +
                    "4. Display Items\n5. Delete Item\n6. Exit");

            int choice = sc.nextInt();


            switch(choice){
                case 1:
                    int id = 1225;
                    String title = "My Journey";
                    double price = 1232.50;
                    int year = 1999;
                    String auth = "Tom";
                    b1.addItem(new Audio(id,title,price,year,auth));
                    mid.addItem(new Audio(id,title,price,year,auth));

                    int id1 = 2;
                    String title1 = "My Life My Rules";
                    double price1 = 232.50;
                    int year1 = 1989;
                    String arti = "Raghu Rammohan";
                    b1.addItem(new Book(id1,title1,price1,year1,arti));
                    mid.addItem(new Book(id1,title1,price1,year1,arti));

                    break;

                case 2:
                    try {
                        //Use the below when no DB.. Not uncommenting since it can throw an ItemNotFoundException
                        //System.out.println("ID Exists??? " + b1.searchItemById(1226));
                        System.out.println("Audio DB Entry Exists??? " + mid.searchItemById(1225));
                        System.out.println("Book DB Entry Exists??? " + mid.searchItemById(2));
                    }
                    catch (Exception e) {
//                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    try {
                        System.out.println("Updating Object Store..");
                        System.out.println(b1.updateItem(new Audio(1232, "Your Journey", 232.50, 1999, "Tom")));
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Updating the value in DB..");
                    mid.updateItem(new Audio(1225, "Your Journey", 2232.50, 1998, "Thomas"));
                    mid.updateItem(new Book(2, "My Life My Rules", 123.50, 2018, "Raghu Rammohan"));

                    break;
                case 4:
                    System.out.println("Fetching all Media Items from object store..");
                    for (int i = 0; i < b1.getItems().size(); i++)
                    {
                        System.out.println("Fetching Item # "+ i + " --> " + b1.getItems().get(i));
                    }

                    System.out.println();
                    System.out.println("Fetching all Media Items from DB..");
                    //System.out.println("DB Count : "+mid.getItems().size());
                    ArrayList<MediaItem> allitems = mid.getItems();
                    for(int j = 0; j < allitems.size(); j++){
                        System.out.println("DB Record # " + j + " --> " + allitems.get(j));
                    }


                    break;
                case 5:
                    System.out.println("Deleting Item from object store..");
                    try {
                        System.out.println(b1.deleteItem(232));
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Delete from Database..");
                    mid.deleteItemById(2);
                    break;
                case 6:
                    System.out.println("Bye, Have a Good day!");
                    exit_status = true;
                    break;
                default:
                    System.out.println("Choose a correct option!");
            }

        }
    }
}
