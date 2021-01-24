package com.assignments.A1;

import java.util.Scanner;

public class Q6Summation {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char complete = 'N';
        while(complete  == 'N') {
            System.out.println("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int res = num1 + num2;
            System.out.println("Sum of " + num1 + " & " +num2 + " is " + res);

            System.out.println("Do you wish to continue? Y / N");
            char cont = sc.next().charAt(0);
            if (cont == 'N' || cont == 'n') {
                complete = 'Y';
                System.out.println("Thank You!!");
            }

        }
    }
}