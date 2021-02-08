package com.learning.jan._28.jdbc;

import com.learning.jan._27.jdbc.MyConnection;
import com.learning.jan._28.jdbc.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerFetch {

    public static ArrayList<Customer> getCustomers(){

        ArrayList<Customer> customers = new ArrayList();
        Connection conn = MyConnection.connect();

        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from customer";
            ResultSet rs = stmt.executeQuery(sql); // Result Set Interface
            //System.out.println(rs.getInt(1));

            while(rs.next()){ // For cursor to move to next record
                Customer customer = new Customer();
                customer.setCid(rs.getInt(1));
                customer.setCname(rs.getString(2));
                customer.setCity(rs.getString(3));
                customer.setAge(rs.getInt(4));
                customers.add(customer);

//                System.out.println(rs.getInt(1));
//                System.out.println(rs.getString(2));
//                System.out.println(rs.getString("City"));
//                System.out.println();


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
        return customers;
    }
}
