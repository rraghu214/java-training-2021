package com.assignments.A2;

public class A4AccountTest {

    public static void main(String[] args) {
        A4Account a1 = new A4Account("A001","Ram",500);
        A4Account a2 = new A4Account("A002","Shyam",1000);
        a1.transferTo(a2,100);
        System.out.println(a1);
        System.out.println(a2);

        a1.transferTo(a2,200);
        System.out.println(a1);
        System.out.println(a2);
    }
}
