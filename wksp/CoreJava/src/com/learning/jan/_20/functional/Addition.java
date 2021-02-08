package com.learning.jan._20.functional;

//Interfaces
@FunctionalInterface
public interface Addition {

    public void add();
    public default void add1(){
        System.out.println("Default add1 method!");
    }
}
interface Division {
     int div(int a, int b);
}