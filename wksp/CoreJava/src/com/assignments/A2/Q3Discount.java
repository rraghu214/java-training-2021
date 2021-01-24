package com.assignments.A2;

public class Q3Discount {
    int cost; //To store the price of the article
    String name; //To store name
    double dc;//To store discount
    double amt;//To store the amount to be paid

    void input(int cost, String name){
        this.cost = cost;
        this.name = name;
    }

    void cal(double dc){
        this.dc = dc;
        this.amt = this.cost - (this.dc/this.cost * 100);
    }

    void display(){
        System.out.println("Name of the customer : " + this.name + "\nCost : "+ this.cost + "\nDiscount : " + this.dc + "\nAmount to be paid : " + this.amt);
        //System.out.println("Cost is %d !!" + cost );
    }

}
