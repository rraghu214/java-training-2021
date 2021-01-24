package com.assignments.PPT.P2CoreJava3_OOPS.A1Methods.Q1;


/**
 * Slide 11
 * Create a class named Eggs  Create a method calculateEggs() in the class Pass no of eggs to this method and display the eggs in dozen
 * 	For eg if no of eggs are 50 method should display 4 dozen and 2 eggs
 * 	Create a class TestEggs to test the Eggs class
 */
public class Eggs {

    private int eggs;
    private int dozen;

    public void CalculateEggs(int x){
        dozen = x/12;
        eggs = x%12;

        System.out.println(dozen + " dozen eggs and " + eggs + " eggs.");

    }

}
