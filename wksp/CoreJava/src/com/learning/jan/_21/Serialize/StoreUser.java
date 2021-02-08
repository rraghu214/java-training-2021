package com.learning.jan._21.Serialize;

import java.io.*;

public class StoreUser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Write an object data in a serialized format.
        Users u1 = new Users("Raghu",25,"India");
        FileOutputStream writer = new FileOutputStream("StoreUsers.txt");
        ObjectOutputStream out = new ObjectOutputStream(writer);
        out.writeObject(u1);
        out.close();
        writer.close();
        System.out.println(u1);


        // Read an object data deserializing.

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("StoreUsers.txt"));
        Users u2 = (Users) in.readObject();
        System.out.println("Deserializing:"+u2);
        in.close();
    }
}
