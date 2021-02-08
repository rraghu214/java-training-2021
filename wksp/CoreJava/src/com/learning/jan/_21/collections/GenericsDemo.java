package com.learning.jan._21.collections;

import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

    //Creating own custom GENERIC Method
    // <T> --> Specifying that it takes generic type parameter.
    // It is not a return type, but just specifying that this method is of type GENERIC.
    // <T> --> also means that it could be any data type.

    // These are bounded parameters, implying I can use ONLY those parameters that implement Comparable interface.

    public static <T extends Comparable<T>> int count(List<T> nos,T ele){
        int count = 0;

        for (T t: nos){
            if(t.compareTo(ele) > 0){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int a = count(Arrays.asList(1,2,3,4,5), 2);

        System.out.println(a);
    }
}
