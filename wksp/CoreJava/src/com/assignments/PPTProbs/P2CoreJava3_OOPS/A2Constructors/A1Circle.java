package com.assignments.PPTProbs.P2CoreJava3_OOPS.A2Constructors;

/**
 * Slide 18
 * Create a class called circle as below :
 *
 * Two private instance variables: radius (of the type double) and color (of the type String),
 * with default value of 1.0 and "red", respectively.
 * Two overloaded constructors - a default explicit constructor with no argument,
 * and a constructor which takes a double argument for radius.
 * Two public methods: getRadius() and getArea(), which return the radius and area of this instance, respectively.
 */

public class A1Circle {
    private double radius;
    private String color;


    A1Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    A1Circle(double rad){
        this.radius = rad;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }
}
