package com.learning.jan._25.stream;

public class Person {
    String fname;
    String lname;
    public Person() {
        System.out.println("Person def const");
    }
    public Person(String fname, String lname) {
        System.out.println("param const");
        this.fname = fname;
        this.lname = lname;
    }
    public String getFullName()
    {
        return fname +" "+lname;
    }
}