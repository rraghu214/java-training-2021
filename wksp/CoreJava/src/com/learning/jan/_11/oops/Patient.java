package com.learning.jan._11.oops;

import java.time.LocalDate;

// Structure of a patient entity
public class Patient {
    // instance variables
    String name;
    String email;
    int age;

    // Methods: Reusable piece of code. Can have BL at 1 place. Changes will be affected to all the users.

    void setValues(String n, int a, String e){
        name = n;
        age = a;
        email = e;
    }

    void printValues(){
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Email is : " + email);
    }
    // Method names start with lower case, the rest of the words are camel case.
    int calculateBirthYear(){ // return type - int
        int year = 0;
        LocalDate currentDate = LocalDate.now();
        // Explore on date time function this week.
        year = currentDate.getYear() - age;


        // return should be the last statement as the control goes back to the caller.
        // You cannot have more than 1 return statement unless within a conditional block.
        return year;
    }
}
