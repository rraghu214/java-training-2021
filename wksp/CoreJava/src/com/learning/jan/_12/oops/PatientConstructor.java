package com.learning.jan._12.oops;
import java.time.LocalDate;
public class PatientConstructor {
    private String name;
    private String email;
    private int age;

    public void display() {

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Age : " + age);
    }

    public int calculateBirthYear() {
        System.out.println("invoked");
        int year = 0;
        LocalDate currentDate = LocalDate.now();
        year = currentDate.getYear() - age;
        return year;
    }
}


