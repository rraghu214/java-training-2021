package com.learning.jan._21.fileio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        System.out.println(file.exists());

        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());

    }
}
