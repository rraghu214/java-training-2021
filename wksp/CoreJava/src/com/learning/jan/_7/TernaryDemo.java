package com.learning.jan._7;

import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//declaring
        System.out.println("Enter a number: ");
        int age = sc.nextInt(); // reading
        System.out.println("Number is : "+ age);

        // ? --> Evaluates for true
        // :  evaluates for false

        String canVote = (age >= 18) ? "Can Vote " : "Cannot Vote";
        System.out.println(canVote);
    }
}
