package com.learning.jan._21.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListGenericsDemo {
    public static void main(String[] args) {

        List <Integer> l1   = new ArrayList <Integer> () ;

        l1.add(10);
        l1.add(99);
        l1.add(23);

        System.out.println(l1);

        Collections.sort(l1);

        System.out.println(l1);

    }
}
