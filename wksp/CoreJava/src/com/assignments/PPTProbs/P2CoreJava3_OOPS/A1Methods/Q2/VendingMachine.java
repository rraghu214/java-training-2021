package com.assignments.PPTProbs.P2CoreJava3_OOPS.A1Methods.Q2;

/**
 * Slide 11
 * Your task is to write a program that simulates a vending machine.
 * Users select a product and provide payment.
 * If the payment is sufficient to cover the purchase price of the product, the product is dispensed and change is given.
 * Otherwise, the payment is returned to the user.
 * Create 2 arrays, 1 to store product names and other product price.
 * Display the menu to the user and based on users choice display the details
 */

public class VendingMachine {

    String [] products = {"Coke","Chips", "Sprite","Biscuit","Apple"};
    double [] price = {20,30,40,50,60};



    public void SelectProduct(){
        System.out.println("Welcome to Vending Machine! Please choose the Item #..");
        for (int i = 0; i < products.length;i++){
            System.out.println("Item # "+(i+1) + ". " +products[i] + ". Price: " + price[i]);
        }
    }

    public void Payment(int itemNo, double amount){
        if (amount < price[itemNo -1]){
            System.out.println("Insufficient Amount, Please pay a minimum of  " + price[itemNo-1]);
        }
        else{
            System.out.println("Thank you. Pick your Item: " + products[itemNo-1] + ". Change dispensed : " + (amount - price[itemNo-1]));
        }
    }
}
