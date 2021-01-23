package com.learning.jan._13.oops;

public class For_ArrayDemo {
    public static void main(String[] args) {
        int x[]= {1,2,3,4,5};
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
        //Java says, if you want to iterate over an array starting from the index - 0 going to the length of the array -
        // Just do forward iteration. If you are no modifying the array itself.
        System.out.println("for-each loop..");
        //for-each loop
        for(int val:x){

            System.out.println(val);
        }

        // Creating an array of objects

        Patient patients[]= new Patient[5]; // Create an array

        System.out.println(patients[0]); // This just print null. Since the default value
        // So, 2 steps
        // 1. create an array
        // 2. Create objects
        Patient p1 = new Patient("n1",12,"e1");
        patients[0] = p1;
        patients[1] = new Patient("n2",10,"e2");
        System.out.println(patients[0].getName()); // Without the above step you will get null pointer exception
    }
}
