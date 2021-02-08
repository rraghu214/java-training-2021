package com.learning.jan._27.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerFetch {

    public static void getCustomers(){
        Connection conn = MyConnection.connect();

        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from customer";
            ResultSet rs = stmt.executeQuery(sql); // Result Set Interface
            //System.out.println(rs.getInt(1));

            while(rs.next()){ // For cursor to move to next record

                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString("City"));
                System.out.println();


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
