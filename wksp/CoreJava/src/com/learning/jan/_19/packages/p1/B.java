package com.learning.jan._19.packages.p1;

public class B extends A{

    B(){
        //System.out.println(pri); Can't access private members
        System.out.println(pub);
        System.out.println(def);
        System.out.println(pro);
    }
}
