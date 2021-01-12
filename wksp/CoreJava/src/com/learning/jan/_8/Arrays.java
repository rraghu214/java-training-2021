package com.learning.jan._8;

public class Arrays {
    public static void main(String [] args) {

        /*
        WAP to store random numbers in an array between 1 to 100. Array size=20
        Now iterate over the array and whenever there is a multiple of 5, just print YEAHH!! You did it.
        For other values don't do anything

         */


        int randomNo [];
        randomNo = new int[20];

        //int i = ((int)(Math.random()*100));

        for (int i =0; i <20; i++){
            randomNo[i] = (int)(Math.random()*100);

            //System.out.println(randomNo[i]);
        }

        System.out.println(randomNo);

        //int num = (int)Math.random(100);

        //for (int i = 1; i <=20; i++){



        //}

    }
}

