package com.assignments.PPTProbs.P1CoreJava2_Basics.A3Loops;

import java.util.Scanner;

/**
 * Slide 26
 * Write a program to enter any number and print all factors of the number.
 */

public class Q3Factors {

    public static void main(String[] args) {
        //int num = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number..");
        int num = sc.nextInt();


        System.out.println("Factors of "+ num);

        for(int i = 1; i <= num; i++){

            if(num%i == 0)
                System.out.print(i + " ");

        }
    }
}
