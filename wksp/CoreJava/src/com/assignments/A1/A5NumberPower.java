package com.assignments.A1;

import java.util.Scanner;

public class A5NumberPower {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Enter the power: ");
        int pw = sc.nextInt();
        int value = 1;

        for (int i =1; i <= pw; i++ ){
            value = num * value;
        }

        System.out.println("Result of " + num + "^"+ pw + " : " + value);
    }
}
