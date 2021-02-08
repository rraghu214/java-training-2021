package com.learning.jan._19.packages.staticDemo;

public class Utility {

    public String temp = "ABC";
    public static String Identity[] = {"A","B","C"};
    public static double calculate (double period){
        if (period <= 1)
            return 0.01;
        else if (period  > 1 && period < 3)
            return 0.08;
        else
            return 0.12;
    }
}
