package com.assignments.PPT.P1CoreJava2_Basics.A2ConditionalConstruct;

import java.util.Scanner;

/**
 * Slide 21
 * Any character is entered through the keyboard.
 * WAP to find whether the character entered is a capital letter , small case letter, digit or a special symbol.
 * [Hint : Use ASCII values to compare
 *
 * ASCII --> Character
 * A-Z --> 65-90
 * a-z --> 97-122
 * 0-9 --> 48-57
 * Special Symbols --> 0-47, 58-64, 91-96, 123-127
 */

public class Q3CharacterCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let me determine the nature of a character you enter: ");
        char ip = sc.next().charAt(0);

        //System.out.printf("%c",ip);

        int val = (int)(ip);

        if (val >= 65 & val <=90)
            System.out.println("Given value is in Uppercase");
        else if (val > 97 & val <122)
            System.out.println("Given value is in Lowercase");
        else if (val > 48 & val <57)
            System.out.println("Given value is a digit");
        else
            System.out.println("Special Symbol");
    }
}
