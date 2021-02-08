package com.assignments.A2;

import java.util.ArrayList;
import java.util.List;

public class Q1Trial {

    public static void main(String[] args) {
        List chars = new ArrayList();

        String test = "Better Butter";

        for(int i=0; i < test.length(); i++){
            char chr = test.charAt(i);
            if (chars.contains(Character.toString(chr)))
                continue;
            else
                chars.add(Character.toString(chr));

            int count = 0;


            for(int j=0; j < test.length(); j++){
                //System.out.println("Letter # "+j + " : "+chr);
                if (chr == test.charAt(j)){
                    count++;
                }
            }
            System.out.println(chr + " : "+count);
        }





    }


}
