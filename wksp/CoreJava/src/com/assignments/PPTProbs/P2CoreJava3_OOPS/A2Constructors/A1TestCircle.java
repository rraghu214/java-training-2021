package com.assignments.PPTProbs.P2CoreJava3_OOPS.A2Constructors;

/**
 * Slide 18
 * Write a test class called TestCircle (in another source file called TestCircle.java)
 * which uses the Circle class and displays the radius and area of the circle.
 */
public class A1TestCircle {

    public static void main(String[] args) {
        A1Circle c1 = new A1Circle();
        A1Circle c2 = new A1Circle(20);

        System.out.println("Radius of circle c1 : " +  c1.getRadius());
        System.out.println("Areas of circle c1 : " +  c1.getArea());

        System.out.println("Radius of circle c2 : " +  c2.getRadius());
        System.out.println("Area of circle c2 : " +  c2.getArea());

    }
}
