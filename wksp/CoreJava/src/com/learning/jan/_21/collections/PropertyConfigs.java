package com.learning.jan._21.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyConfigs {

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();

        props.put("email","def@gmail.com");
        props.put("Environment","TST");
        props.put("Debug","true");

        FileOutputStream fos = new FileOutputStream("Config21Jan.properties");

        props.store(fos, "Comments from PropertyConfigs.java");
        fos.close();


        Properties props1 = new Properties();
        FileInputStream fis = new FileInputStream("Config21Jan.properties");
        props1.load(fis);
        //props1.getProperty("email");


        System.out.println(props1.get("Environment"));

    }
}
