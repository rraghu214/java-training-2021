package com.assignments.A2;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a java program to find duplicate characters and their count in a given string?
 * For example, in a string “Better Butter”, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.
 */

public class Q1DuplicateCharacters {

    private static List chars = new ArrayList();

    public static void main(String[] args) {
        String val = "Better Butter";

        for (int i = 0; i < val.length(); i++) {
            char ch = val.charAt(i);
            if (isProcessedChar(ch))
                continue;

            int count = 0;
            System.out.println("Character: " + ch);
            for (int j = 0; j < val.length(); j++) {
                if (ch == val.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch + " : " + count);
        }
        chars.clear();
    }

    private static boolean isProcessedChar(char ch) {

        if (chars.contains(Character.toString(ch))) {
            return true;
        } else {
            chars.add(Character.toString(ch));
        }
        return false;
    }
}
