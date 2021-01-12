package com.learning.jan._8;

import java.util.Scanner;

public class LoopsDemo {

    public static void main(String[] args){

        int sumTotal = 0;
        Scanner sc = new Scanner(System.in);

        for (int i=1;i<=5;i++){
            System.out.println("Enter the invoice amount " + i +" for invoice: ");
            sumTotal = sumTotal + sc.nextInt();
        }
        sc.close();

        System.out.println("Invoice Total : " + sumTotal);

    }

}
