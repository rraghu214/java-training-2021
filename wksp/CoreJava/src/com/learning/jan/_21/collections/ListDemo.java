package com.learning.jan._21.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListDemo {

    public static void main(String[] args) {
        List l1 = new ArrayList();
        //List l2 = new LinkedList();
        //List l3 = new Stack();

        l1.add(10.0);
        l1.add(10.0);
        l1.add("Ra");
        l1.add(true);

        System.out.println(l1.size());
        System.out.println(l1);
        System.out.println(l1.get(2));


        for (int i = 0;i<l1.size();i++)
            System.out.println(l1.get(i));

        System.out.println("Out of for loop... entering the enhanced for loop");

        for (Object obj: l1)
            System.out.println(obj);

        System.out.println("Out of  enhanced for loop");
    }
}
