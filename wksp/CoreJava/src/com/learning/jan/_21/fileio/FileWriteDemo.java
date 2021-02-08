package com.learning.jan._21.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("user.txt",true);
        // It checks if a file exists. If yes --> No Action. If doesn't exist --> creates it.
        //writer.write('A');
        writer.write("\nLine1");
        writer.write("\nLine2");
        writer.write("\nLine3");writer.write("\nLine4");
        writer.close();

    }
}
