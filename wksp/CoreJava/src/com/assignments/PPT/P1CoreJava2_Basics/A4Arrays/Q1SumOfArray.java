package com.assignments.PPT.P1CoreJava2_Basics.A4Arrays;
/**
 * Slide-34
 * Write a program to take 5 nos as input from the user and print the sum of all the numbers in the array
 */

import java.util.Scanner;

public class Q1SumOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num []= new int[5];

//    int intArray[];    //declaring array
//    intArray = new int[20];  // allocating memory to array
//    int[ ] arr; 	//declaration
//    arr = new int[10]; // creation

        for(int i = 0 ; i<= num.length-1; i++){
            System.out.println("Enter number #" + (i+1));
            num[i] = sc.nextInt();
        }

        //System.out.println(num);
        int sum = 0;
        for(int j: num){
//            System.out.println("sum is "+ sum);
//            System.out.println(j);
            sum = sum + j;
        }
        System.out.println("Sum is: "+ sum);
    }
}
