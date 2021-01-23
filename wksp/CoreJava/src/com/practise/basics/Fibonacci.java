package com.practise.basics;

import java.util.Scanner;

/**
 * https://www.youtube.com/watch?v=2kyctZDPeio&list=PLGwb7xZHg-oOKDMYoi-1ILNBGlorUU460&index=4
 */
public class Fibonacci {

    public static void main(String[] args) {
        //int howmany = 9;
        int howmany;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers do you want ?");
        howmany = sc.nextInt();
        int num = 1;
        int num1 = 1;
        int num2 = 1;
        int k =3;

        System.out.println("1. "+num1);
        System.out.println( "2. "+num2);

        for (int i = 0; k <= howmany ; i++){
            num1 = num1 + num2;
            //System.out.print(i+3);
            System.out.println(k + ". " +num1);
            k++;
            num2 = num1+num2;
            //System.out.print(i+4);
            //if (k <)
            System.out.println(k + ". "+num2);
            k++;

        }

        System.out.println("Implementation 2: ");

        System.out.println("Enter the number limit");
        int n = sc.nextInt();
        int p=0, a = 1, b =1;

        System.out.print("1 1 ");

        while(p<=n){
            p = a+b;
            if (p >n)
                break;
            System.out.print(p + " ");
            a = b;
            b = p;
        }

    }


}
