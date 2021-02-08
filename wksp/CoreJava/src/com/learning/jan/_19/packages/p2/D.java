package com.learning.jan._19.packages.p2;

import com.learning.jan._19.packages.p1.A;

public class D extends A {

    D(){
        //System.out.println(pri); Can't access private members
        System.out.println(pub);
        //System.out.println(def); // Can't access default params.
        System.out.println(pro);
    }

}
