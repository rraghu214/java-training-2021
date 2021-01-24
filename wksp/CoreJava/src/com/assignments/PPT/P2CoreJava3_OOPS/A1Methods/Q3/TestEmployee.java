package com.assignments.PPT.P2CoreJava3_OOPS.A1Methods.Q3;

public class TestEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();

        e1.input(79121, "Emp1",70000);
        e2.input(79122, "Emp2",120000);
        e3.input(79123, "Emp3",170000);
        e4.input(79124, "Emp4",270000);

        e1.cal();
        e2.cal();
        e3.cal();
        e4.cal();

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
