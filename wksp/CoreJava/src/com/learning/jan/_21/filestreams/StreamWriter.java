package com.learning.jan._21.filestreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamWriter {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("StreamText.txt");
            fout.write(122); // Writing it in Bytes.
            fout.close();
            System.out.println("File written Successfully!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
