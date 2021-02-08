package com.learning.jan._21.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("user.txt");
        //System.out.println(fr.read()); // .read() --> Reads a single byte and converts it to ASCII
        int i = 0;
        while((i = fr.read())!=-1)
            //System.out.println(i);
            System.out.print((char)i);
        fr.close();

    }
}
