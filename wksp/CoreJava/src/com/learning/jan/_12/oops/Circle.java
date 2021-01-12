package com.learning.jan._12.oops;

public class Circle {
    private double radius = 1.0;
    private String colour = "red";

    public Circle (){
        System.out.println("In Default constructor!");
        System.out.println("I have set the radius to : " + this.radius );
    }

    public Circle(double radius){
        this.radius = radius;
        System.out.println("Overloaded constructor with custom radius!");
        System.out.println("I have set the radius to : " + this.radius );

    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }
}
