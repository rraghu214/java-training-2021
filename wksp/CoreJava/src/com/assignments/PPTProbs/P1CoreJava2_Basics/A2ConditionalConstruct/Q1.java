package com.assignments.PPTProbs.P1CoreJava2_Basics.A2ConditionalConstruct;

/**
 * Slide 21
 */
public class Q1 {

    public static void main(String[] args) {
        int x,y=1; x = 10;
        if (x != 10 && x / 0 == 0)
            System.out.println(y);
        else
            System.out.println(++y);

    }
}
