package com.assignments.PPT.P1CoreJava2_Basics.A1Operators;

/**
 * Slide 16
 * If a 3 digit no is provided, WAP to calculate the sum of its digits. Eg: no = 123.
 * Then output should be 1 + 2+ 3 = 6
 */
public class Q3SumOfDigits {
    public static void main(String[] args) {

        int num = 123;
        String mynum = "123";

        // Trying this out with any loops or generalization!

        String s[] = mynum.split("");

        int r1 = num%10;
        int d1 = num/10;
        int r2 = d1%10;
        int d2 = d1/10;
        int total = r1 + r2 + d2;

        System.out.println(s[0] + " + " + s[1] + " + " + s[2] + " = " + total );



    }
}
