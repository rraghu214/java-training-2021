package com.assignments.A2;

import java.util.Scanner;

public class Q2CompleteSqrt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = 5;
        int a []; //Declaration
        a = new int[index];
        System.out.println("Enter " + index + " numbers. I will identify the complete square root! ");
        for (int i=1; i <=index;i++){

            System.out.println("Number " + i );
            a[i-1] = sc.nextInt();
        }

        for (int i=1 ; i <= index;i++ ) {
            double val = Math.sqrt(a[i-1]);
            //System.out.println("Square root of " + a[i-1] + " is " + val);

            if (Math.floor(val) == val) {
                System.out.println(a[i-1] + " is a complete square root!"  + "\n");
            }


        }

        }

    }
