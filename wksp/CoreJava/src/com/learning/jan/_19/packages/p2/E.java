package com.learning.jan._19.packages.p2;

//import com.learning.jan._19.packages.p1.A;

public class E {
    E(){
        //*********************
        com.learning.jan._19.packages.p1.A  a1 = new com.learning.jan._19.packages.p1.A();
        //packages.. without using import

        //*********************
        //System.out.println(a1.pri);// Can't access private members
        System.out.println(a1.pub);
        //System.out.println(a1.def); // Can't access default members
        //System.out.println(a1.pro); // Can't access protected members
    }
}
