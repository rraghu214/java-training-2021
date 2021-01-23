package com.learning.jan._13.oops;
import java.time.LocalDate;

// HMS => mobile app, web app, desktop app?
public class PatientGetterSetter {
    private String name;
    private String email;
    private int age;


    public PatientGetterSetter(){
    }
    public PatientGetterSetter(String name , int age,
                               String email ){
        this.name = "Mr. "+name;
        this.age=age;
        this.email = email;
    }

    // getters or accessors. Convention  ==> return type is same as the property.
    // takes no parameters
    // starts with get

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }


    // setters or mutators
    // should return void
    // taken only one parameter of the same type as the property
    // starts with set


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    public void display()
    {
        String name;
        System.out.println("Display=========");
        System.out.println("Name : "+this.name);// instance variable
        if(email == null)
            System.out.println(  "No Email : ");
        else
            System.out.println("Email "+email);
        System.out.println("Age : "+age);
    }


     */

    //Generated by the IDE. I can modify this. Override is the annotation used.. Annotations are like decorators.
    // VVIMP: Cannot change the signature of the method.
    // -    Not even the return type. public int toString() {
    // -    Not even the method name. public String toString1()
    // -    You can may be add method parameter. : public String toString(int x)
    @Override
    public String toString() {
        return "PatientGetterSetter{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    //p1.cal
    public int calculateBirthYear()
    {
        System.out.println("invoked");
        int year = 0;
        int age = 20;
        LocalDate currentDate  = LocalDate.now();
        year  = currentDate.getYear() - this.age;
        return year;
    }
}
