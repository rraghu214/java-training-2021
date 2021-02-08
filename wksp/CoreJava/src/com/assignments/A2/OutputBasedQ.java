package com.assignments.A2;

public class OutputBasedQ {

    public static void main(String[] args) {

        //State value of characteristic and mantissa :

        String s = "4.3576";
        int n = s.indexOf(".");
        System.out.println(n);

        int characteristic = Integer.parseInt(s.substring(0,n));
        int mantissa = Integer.valueOf(s.substring(n+1));
        System.out.println("Characteristic : " + characteristic + " Mantissa : "+ mantissa);

    }
}
