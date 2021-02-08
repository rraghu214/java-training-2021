package com.learning.jan._27.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

//    public static void connect() throws ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver"); // dynamically loads the class
//    }

    public static Connection connect()  {

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // dynamically loads the class
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/allstate?useSSL=false","root","rps@12345");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Driver Loaded!");
    return conn;
    }

}
