package com.learning.jan._8;

import java.util.Scanner;

public class MultiplesOfANumber {

    public static void main(String [] args) {

        // Scanner sc = new Scanner(System.in);
        //int no = sc.nextInt();


        for (int x = 1; x<=5; x++){
            int y = 1;
            while(y<=x){

                if (y==x)
                    break;
                System.out.println(y);
                y++;


            }
            x++;
        }


    }
}
