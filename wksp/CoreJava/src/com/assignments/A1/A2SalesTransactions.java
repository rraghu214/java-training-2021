package com.assignments.A1;

import java.util.Scanner;

public class A2SalesTransactions {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input for price of an item.

        System.out.println("Input the price of an item : ");
        double ip = sc.nextDouble();

        // Salesperson commission in %
        System.out.println("Salesperson commission in % : ");
        double sp_com = sc.nextDouble();

        // Customer Discount %
        System.out.println("Customer Discount % : ");
        double cus_dis = sc.nextDouble();

        System.out.println("Item value : "+ ip + " Sales Person Commission: " + sp_com + " Customer Disc: " + cus_dis);

        // Final Price

        double final_price = (ip + (ip * sp_com / 100) ) - (ip * cus_dis / 100);

        System.out.println("Final Price is : " + final_price);
    }
}
