package com.learning.jan._19.packages.staticDemo;

public class Demo {
    public static void main(String[] args) {
        Utility ob1 = new Utility();
        System.out.println(ob1.calculate(2));

        System.out.println(ob1.Identity);
        System.out.println(Utility.calculate(8));

        System.out.println(ob1.temp);
        //System.out.println(Utility.temp); can't access an instance variable as a className.varName..
        // it should have been objName.varName


    }

}
