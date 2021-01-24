package com.assignments.A2;

public class Q3TestDiscount {

    public static void main(String[] args) {
        int cost = 100;
        String name = "Raghu";
        double dc = 10.0;
        //double amt;

        Q3Discount d1 = new Q3Discount();
        d1.input(cost,name);
        d1.cal(dc);
        d1.display();

    }
}
