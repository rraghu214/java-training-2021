package com.learning.jan._7;

import java.util.Scanner;

public class TicketValidation {
    public static void main(String[] args){
        //int num = 123453;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 6 digit number: ");
        int num = sc.nextInt();
        int new_num = num/10; // Remove last digit
        int last_digit = num%10;
        System.out.println("5 digit number is: "+new_num);

        int new_num1 = new_num % 7;
        System.out.println("Reminder is: "+new_num1);

        System.out.println("last digit is " + last_digit);

        if (last_digit == new_num1){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
