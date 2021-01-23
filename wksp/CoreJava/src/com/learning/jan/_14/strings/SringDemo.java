package com.learning.jan._14.strings;

import java.util.Scanner;

public class SringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";

        //System.out.println("String Length :" + s1.length());
        //System.out.println("ToUpperCase :" + s1.toUpperCase());

        String s2 = "Hello World";

        System.out.println("1. s1 ==s2 " + (s1 == s2));
        Scanner sc = new Scanner(System.in);
        //String s3 = sc.next();// ENTER: Hello ... btw next() reads only a single word.
        String s3 = sc.nextLine();// Reads the whole line
        System.out.println("*****************");
        System.out.println("2. s1 : " + s1);
        System.out.println("3. s3 : " + s3);
        System.out.println("4. s1 == s3 is: " + (s1 == s3)); // This prints false.. since - String pool is maintained & compared at compile time
        // and not at runtime.

        // To do this, you must use equals..
        System.out.println("5. Equals : "+s1.equals(s3));

        System.out.println("6. " + s1.indexOf('l')); // Index of the first occurance of the character. If it doesn't find, returns -1
        System.out.println("7. " + s1.charAt(1)); // Get the character at the given index

        System.out.println("8. Substring 2 to last: " + s1.substring(2));
        System.out.println("9. Substring 2 to 4: " + s1.substring(2,4));
    }
}
