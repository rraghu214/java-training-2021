package com.learning.jan._28.jdbc;

import com.learning.jan._27.jdbc.MyConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

    public static void main(String[] args) throws SQLException {
        Connection con = MyConnection.connect();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        String sql = "insert into customer (cname, city,age) values(?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,name);
        stmt.setString(2,city);
        stmt.setInt(3,age);

        stmt.executeUpdate();
        con.close();
    }
}
