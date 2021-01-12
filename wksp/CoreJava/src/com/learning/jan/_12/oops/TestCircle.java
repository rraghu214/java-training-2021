package com.learning.jan._12.oops;

public class TestCircle {
    public static void main(String[] args) {
        Circle p1 = new Circle();

        //p1.getRadius();
        Circle p2 = new Circle(5.0);
        System.out.println("Radius of P1 "+p1.getRadius());
        System.out.println("Area of P1 "+p1.getArea());
        System.out.println("===========================");
        System.out.println("Radius of P1 "+p2.getRadius());
        System.out.println("Area of P2 "+p2.getArea());

    }
}
