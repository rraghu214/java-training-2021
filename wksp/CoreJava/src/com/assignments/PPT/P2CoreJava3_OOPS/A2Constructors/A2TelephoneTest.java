package com.assignments.PPT.P2CoreJava3_OOPS.A2Constructors;

/**
 * Slide 19
 * Create a class TestBill and create Bill object in the main() method and invoke the above function to perform the desired task.
 */
public class A2TelephoneTest {

    public static void main(String[] args) {
        A2TelephoneBill a1 = new A2TelephoneBill(1234,"Person1",75);
        A2TelephoneBill a2 = new A2TelephoneBill(5678,"Person2",175);
        A2TelephoneBill a3 = new A2TelephoneBill(1441,"Person3",275);
        A2TelephoneBill a4 = new A2TelephoneBill(1991,"Person4",375);
        A2TelephoneBill a5 = new A2TelephoneBill(0100,"Person5",475);

        a1.Calculate();
        a2.Calculate();
        a3.Calculate();
        a4.Calculate();
        a5.Calculate();

        a1.display();
        a2.display();
        a3.display();
        a4.display();
        a5.display();
    }
}
