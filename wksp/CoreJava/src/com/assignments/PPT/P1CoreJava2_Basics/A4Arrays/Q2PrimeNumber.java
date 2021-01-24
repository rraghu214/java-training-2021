package com.assignments.PPT.P1CoreJava2_Basics.A4Arrays;

/**
 * Slide 34
 * WAP to declare an array of 10 nos. Take input from the user.  Print list of prime nos from the array.
 */

public class Q2PrimeNumber {
    public static void main(String[] args) {
        //int num [] = new int[10];
        int num [] = {2,3,4,5,6,7,8,9,10,11};

        for(int i : num){
            boolean isPrime = true;
            for(int j = 2; j<i; j++){

                if (i%j == 0) {
                    //System.out.println(i + " is not a prime number");
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
