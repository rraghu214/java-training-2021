package com.assignments.A2;

public class A2CompleteSqrt {
    public static void main(String[] args){

        int a []; //Declaration
        a = new int[10];

        System.out.println(a[0]);

        for (int i=1; i <=10;i++){
            a[i-1] = i * 5;
            //System.out.println(a[i-1]);
        }

        for (int i=1 ; i <= 10;i++ ) {
            double val = Math.sqrt(a[i-1]);
            System.out.println("Square root of " + a[i-1] + " is " + val);
        }

        }

    }
