package com.learning.jan._20.functional;
// Functional Interfaces..
public class TestAddition {
    public static void m1(Addition a){
        a.add();
    }

    public static void main(String[] args) {
        // Using Functional Interface
        Addition add1;
        add1 = new Addition(){

            @Override
            public void add1() {
                System.out.println("Not the default add method!");
            }
            @Override
            public void add() {
                System.out.println("Adding from a functional interface..");
            }
        };
        add1.add();
        add1.add1();

        // Using anonymous inner class

        m1(new Addition(){
            @Override
            public void add() {
                System.out.println("Adding from the anonymous inner class!");
            }
        });

        //Lambdas or arrow syntax
        Addition add2;
        add2 = () -> System.out.println("Adding using lambdas");
        add2.add();

        Addition add3;
        // variable = (params) -> logic
        add3 = () -> {
            System.out.println("Using Lambdas with multiple lines");
            System.out.println("Line 2");

        };
        add3.add();
        add3.add1();
        // Lambdas are the concise syntax of functional interface!

        Division div1 = (int a, int b) -> a/b;
        System.out.println(div1.div(10,3));

        Division div2 = (int a, int b) -> {return a/b;};
        System.out.println(div2.div(12,2));
    }
}
