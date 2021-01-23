package com.learning.jan._13.oops;

import java.time.LocalDate;
// Model or beans or reusable components
// represents state
public class Patient {
    private String name;
    private String email;
    private int age;

    public Patient(){
    }
    public Patient(String name , int age,
                   String email ){
        this.name = "Mr. "+name;
        this.age=age;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null)
            this.email = email;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", email='" + email + '\'' +
                        ", age=" + age;
    }


    public int calculateBirthYear()
    {
        int year = 0;
        int age = 20;
        LocalDate currentDate  = LocalDate.now();
        year  = currentDate.getYear() - this.age;
        return year;
    }
}