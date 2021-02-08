package com.learning.jan._19.packages.p1;

public class C{

    C(){
        A a1 = new A();
        //System.out.println(pri); //Can't access private members
        System.out.println(a1.pub);
        System.out.println(a1.def);
        System.out.println(a1.pro);
    }
}
