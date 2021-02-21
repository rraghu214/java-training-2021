package com.assignments.PPTProbs.P2CoreJava3_OOPS.A1Methods.Q2;

import java.util.Scanner;

public class TestVendingMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VendingMachine v = new VendingMachine();

        v.SelectProduct();
        int item = sc.nextInt();
        System.out.println("Put the amount.");
        double amt = sc.nextDouble();
        v.Payment(item, amt);

    }
}
