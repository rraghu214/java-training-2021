package com.learning.jan._8;

public class BreakContinueDemo {

    //Jump Statements

    public static void main(String [] args){

        for (int i=1; i<=5;i++){

            if(i%2==0)
                //continue;
                continue;
            System.out.println(i + " " + Math.pow(i,3));
        }

        int i =0;
        while(i++<=5){
            if(i%2 == 0) {
                //i++;
                continue;
            }
            System.out.println(i + " " + Math.pow(i,3));
            //i++;


        }

    }
}
