package com.assignments.A3.enums;

import java.util.Scanner;

/**
 * 	Your task is to write a program that simulates a vending machine.
 *      Users select a product and provide payment.
 *          If the payment is sufficient to cover the purchase price of the product, the product is dispensed and change is given.
 *          Otherwise, the payment is returned to the user.
 * 	Create an Enum VendingItem as follows:
 * 	price should be a parameter to the enum constructor.
 */

public class Q1VendingMachine {

    enum VendMach{
        LAYS(1.50),DORITOS(1.50),COKE(2.50),RAMBLIN_RECK_TOY(180.75),
        RUBICKS_CUBE(30.00),RAT_CAP(15.00),FASET_LANYARD(10.00),CHEETOS(1.25),
        SPRITE(2.50),RED_BULL(4.75),RAMEN(3.15),COLD_PIZZA(0.99);



        private double amt;

        VendMach(){

        }

        VendMach(double price){ //Constructor
            this.amt = price;
        }

        public double getPrice(){
            return amt;
        }


//
//        public double dispenseChange(VendMach vm){
//
//
//            System.out.println("Thank you. Pick your Item: " + vm + ". Change dispensed : " + (amt - vm.getPrice()));
//
//            return (amt - vm.getPrice());
//        }
    }

//    public static void main(String[] args) {
//        System.out.println("Welcome to Vending Machine! Please select from following items");
//
//        System.out.println("##################");
//
//        for (VendMach vm : VendMach.values()){
//            System.out.println(vm + " : " + vm.getPrice());
//        }
//
//        System.out.println("\n\nAnd your item is..?");
//
//        Scanner sc = new Scanner(System.in);
//
//        String choice = sc.next();
//
//        VendMach v = VendMach.valueOf(choice.toUpperCase());
//
//        System.out.println(" Than you for choosing : " + v + " \nPlease tender in the amount of: " + v.getPrice());
//
//        double amt = sc.nextDouble();
//
//
//        while (amt < v.getPrice()){
//            System.out.println("Insufficient Amount. Amount returned. Please put in a minimum of " + v.getPrice());
//            amt = sc.nextDouble();
//
//            if(amt > v.getPrice())
//                break;
//            else
//                continue;
//        }
//
//        System.out.println("Thank you. Pick your Item: " + v + ". Change dispensed : " + (amt - v.getPrice()));
//    }
}
