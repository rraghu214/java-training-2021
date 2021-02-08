package com.learning.jan._21.filestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamStringReader {

    public static void main(String[] args) {
        try {
            //FileInputStream fin = new FileInputStream("StreamStringText.txt");
            FileInputStream fin = new FileInputStream("user.txt");
            int i = 0;

            while ((i = fin.read()) != -1)
                System.out.print((char)i);
            //System.out.println((char)i);
            fin.close();
            System.out.println("\nFile Read Successfully!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
