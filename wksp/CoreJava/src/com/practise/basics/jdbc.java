package com.practise.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useSSL=false","root","rps@12345");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from customers");
            
            while(rs.next()){
                System.out.println(rs);
            }

            }catch(Exception e )
        {
            System.out.println(e);
        }
        finally{
            //System.out.println();
            //con.close();
        }



    }
}
