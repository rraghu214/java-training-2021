package com.learning.jan._25.stream;

import java.util.ArrayList;
import java.util.function.*;
public class MethodRefDemo {
    public static void main(String[] args) {
        // lambda expressions
        Predicate<Integer> predicate=
                new Predicate<Integer>(){
                    @Override
                    public boolean test(Integer s) {
                        return s!=0;
                    }
                };
        Predicate<String> pred = str ->  str.substring(1,5).equals("");
        String s1 = "Hello";
// :: Method reference
        BiPredicate<String, String> predicate1 = String::equals;
        BiPredicate<String, String> predicate2 = String::equals;
//        new BiPredicate<String, String>()
//        {
//
//            @Override
//            public boolean test(String s, String s2) {
//                return s1.equals(s2);
//            }
//        }
        System.out.println(predicate1.test("hello", "hello"));
        Function<String, Integer> f1 = String::length;// (s1-> s1.length())
        System.out.println(f1.apply("Allstate"));
        BiFunction<String, String, Integer> f2 = String::compareTo;
        System.out.println(f2.apply("apple","banana"));
        new BiFunction<String, String,Integer>(){
            @Override
            public Integer apply(String s, String s2) {
                return s.compareTo(s2);
            }
        };
// compareTo
        "apple".compareTo("apple");// returns an int
        Supplier<String> supplier = String::new;
        String list = supplier.get();
//list.add(10);
//        PersonFactory factory = new PersonFactory(){
//
//            @Override
//            public Person create(String fname, String lname) {
//                return new Person(fname, lname);
//            }
//        };
        //PersonFactory factory = (fname,  lname) ->new Person(fname, lname);
        PersonFactory factory = Person::new;
        System.out.println(factory.create("Shalini","Mittal"));
    }
}



