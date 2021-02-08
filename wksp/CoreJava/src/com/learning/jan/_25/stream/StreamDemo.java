package com.learning.jan._25.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class StreamDemo {
    public static void main(String[] args) {
        Stream<Integer> streamInt = Stream.of(1,2,3,4,5);
        List<String> names = Arrays.asList("Ashok", "Pooja", "Shalini","Abhishekh","Raghu");
        Stream<String> namesStream = names.stream();
        // intermediate op =>lazy evaluation
        Stream<String> filterStream = namesStream.filter(new Predicate<String>(){
            @Override
            public boolean test(String s) {
                System.out.println("test called "+s);
                return s.startsWith("A");
            }
        });
        // map -> intermeiate op
        Stream<String> convertStream = filterStream.map((name) ->{
            System.out.println("in map "+name);
            return name.toUpperCase();
        } );
        // System.out.println(convertStream.count());// terminal operation
        convertStream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Printing "+s);
            }
        });
        Stream<String> st = names.stream().filter(name -> name.startsWith("A"))
                .map(name->name.toUpperCase());
        System.out.println(names);

        for(String s :names)
        {
            if(s.startsWith("A"))
                System.out.println(s.toUpperCase());
        }
    }
}
