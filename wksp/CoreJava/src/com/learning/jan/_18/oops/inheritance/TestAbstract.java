package com.learning.jan._18.oops.inheritance;

public class TestAbstract {
    public static void main(String[] args) {
        Item item;
        //item = new Item();
        Book b1 ;
        b1= new Book("a","b","c");

        item = b1;

        b1.calculatePrice();
        //b1.
        item.calculatePrice();
       // b1.
    }
}
