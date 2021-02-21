package com.assignments.PPTProbs.P1CoreJava2_Basics.A3Loops;

/**
 * Side-26
 * Write a program to enter any number and calculate sum of its digits.
 */
public class Q1SumOfDigits {
    public static void main(String[] args) {
        int num = 98765432;
        int bkp = num;
        int rem = 0;
        while(num > 0){
            rem = rem+ num%10;
            //System.out.println("Reminder :"+ rem);
            num = num/10;
            //System.out.println("Num :" + num);
        }
        System.out.println("Sum of digits "+ bkp + " is :"+ (rem+num));
    }

}
