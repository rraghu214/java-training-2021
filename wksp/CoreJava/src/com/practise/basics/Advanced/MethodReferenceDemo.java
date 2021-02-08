package com.practise.basics.Advanced;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        Predicate <String> pr;
        new Predicate<String>(){
            @Override
            public boolean test(String s) {
                return s.length() > 0;
            }
        };

        // Using Lambdas

        pr = str -> str.length() > 0;

        // Method Reference

        BiPredicate<String, String> bipr1 = String::equals;
        String s1 = "AAD";

        System.out.println(bipr1.test("hello","hello "));


        Supplier<ArrayList<String>> al = ArrayList::new;
        ArrayList<String> al1= al.get();
        al1.add("R");
        al1.add("A");
        al1.add("G");
        al1.add("H");
        al1.add("U");
        System.out.println(al1.size());
    }
}
