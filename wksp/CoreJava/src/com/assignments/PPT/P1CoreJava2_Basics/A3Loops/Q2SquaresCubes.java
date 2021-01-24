package com.assignments.PPT.P1CoreJava2_Basics.A3Loops;

/**
 * Slide 26
 * Write a program that displays the squares/cubes of the numbers from 0 to 14:
 */

public class Q2SquaresCubes {
    public static void main(String[] args) {
        int num =1;
        System.out.println("Printing the Squares and cubes..");
        while(num<=14){
            System.out.println(num + ", Square: "+ (num * num) + ", Cube: " + (num * num * num) );
            num++;
        }
    }
}
