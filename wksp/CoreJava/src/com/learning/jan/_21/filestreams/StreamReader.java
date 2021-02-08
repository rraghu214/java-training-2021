package com.learning.jan._21.filestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamReader {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("StreamText.txt");
            int i = fin.read();
            System.out.println((char)i);
            System.out.println("File Read Successfully!");
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
