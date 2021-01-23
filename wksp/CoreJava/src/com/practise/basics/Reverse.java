package com.practise.basics;

public class Reverse {

    public static void main(String[] args) {
        String str = "Hello Hi 123 you";

        String a[] = str.split(" ");

        for(int i = 0; i< a.length;i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\nReverse the words");

        for(int i = a.length -1 ; i>=0 ;i--){
            System.out.print(a[i] + " ");
        }
        //str.r
    }

}
