package com.learning.jan._21.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set <Integer> s1 = new HashSet();
        s1.add(1);
        s1.add(2);
        s1.add(2);
        s1.add(1);
        System.out.println(s1.size());
        //s1.add("2"); Can't add strings, as I have mentioned the generics that it is Integer only.
        //s1.add("1");
        System.out.println(s1.size());
        s1.add(3);
        System.out.println(s1.size());
        System.out.println(s1);

        System.out.println("Lists without generics! Can store any data types together");
        Set s2 = new HashSet();
        s2.add(1);
        s2.add(2);
        s2.add(2);
        s2.add(1);
        System.out.println(s2.size());
        s2.add("2");
        s2.add("1");
        System.out.println(s2.size());
        s2.add(3);
        System.out.println(s2.size());
        System.out.println(s2);
    }

}
