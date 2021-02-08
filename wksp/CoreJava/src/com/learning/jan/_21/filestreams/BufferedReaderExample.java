package com.learning.jan._21.filestreams;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("user.txt");
        BufferedReader bf = new BufferedReader(fr);

        int i;
        while((i=bf.read())!=-1){
            System.out.print((char)i);
        }
        bf.close();
        fr.close();


    }
}
