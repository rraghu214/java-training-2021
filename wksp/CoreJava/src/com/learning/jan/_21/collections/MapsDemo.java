package com.learning.jan._21.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("A",20);
        m1.put("B",21);
        System.out.println(m1);

        System.out.println(m1.get("A"));
        m1.putIfAbsent("A",222);
        System.out.println(m1);

        System.out.println(m1.keySet());
        System.out.println(m1);



        // As generics

        Map <String, Integer>m2 = new HashMap();

        m2.put("v1",30);
        m2.put("v2",40);
        m2.put("v3",50);
        m2.put("v4",60);
        m2.put("v5",70);
        m2.put("v6",80);
        m2.put("v7",90);
        m2.put("v8",10);
        m2.put("v9",20);

        for (Map.Entry<String, Integer> x : m2.entrySet()){
            System.out.println(x.getKey() + " --> "+x.getValue());
        }

        System.out.println(m2);
    }
}
