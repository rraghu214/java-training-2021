package com.assignments.A3.enums;

import java.util.Scanner;

public class TestVendMach {

    public static void main(String[] args) {

        System.out.println("Welcome to Vending Machine! Please select from following items");

        System.out.println("##################");

        for (Q1VendingMachine.VendMach vm : Q1VendingMachine.VendMach.values()){
            System.out.println(vm + " : " + vm.getPrice());
        }


        System.out.println("\n\nAnd your item is..?");

        Scanner sc = new Scanner(System.in);

        String choice = sc.next();

        Q1VendingMachine.VendMach v = Q1VendingMachine.VendMach.valueOf(choice.toUpperCase());


        System.out.println(" Than you for choosing : " + v + " \nPlease tender in the amount of: " + v.getPrice());

        double amt = sc.nextDouble();
        double price = v.getPrice();


        while (amt < v.getPrice()){
            System.out.println("Insufficient Amount. Amount returned. Please put in a minimum of " + v.getPrice());
            amt = sc.nextDouble();

            if(amt > v.getPrice())
                break;
            else
                continue;
        }

        System.out.println("Thank you. Pick your Item: " + v + ". Change dispensed : " + (amt - v.getPrice()));

        //v.dispenseChange(price);
    }
}
