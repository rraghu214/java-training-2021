package com.assignments.PPTProbs.P1CoreJava2_Basics.A1Operators;

/**
 * Slide 16
 if a = 4, b = 3; find the value of
 C = a++ * 6 + ++b*5 +10
 */
public class Q1Value {

    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int C = a++ * 6 + ++b*5 +10;
        System.out.println(C);
    }
}
