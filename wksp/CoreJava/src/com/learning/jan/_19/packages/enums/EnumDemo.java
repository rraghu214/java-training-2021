package com.learning.jan._19.packages.enums;

import java.util.Scanner;

public class EnumDemo {

    enum Week{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    enum FontSize{
        TWENTY(20), TWENTYTWO(22);

        private int size;

        FontSize(int size){  // Constructor
           this.size=size; //Assigns the integer
        }

        public int getSize(){
            return size;
        }
    }

    public static final String  MONDAY = "monday";

    void m1(){
        System.out.println(EnumDemo.MONDAY);
        //Week.
    }

    void m2(Week dayOfWeek){

    }

    public static void main(String[] args) {

        for(Week w : Week.values() ){
            System.out.println(w);
        }

        for ( FontSize f : FontSize.values()){
            System.out.println(f.ordinal()); // Provides the index of the element
            System.out.println(f.getSize());
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a font size: ");
        String day = sc.next();
        FontSize wee = FontSize.valueOf(day.toUpperCase());

        System.out.println("You have chosen: "+ wee);

        System.out.println("You have chosen: "+ wee.getSize());

    }
}
