package com.learning.jan._28.jdbc;

import com.learning.jan._28.jdbc.Customer;
import com.learning.jan._28.jdbc.CustomerFetch;

public class TestCustDB {

    public static void main(String[] args) {
        //MyConnection.connect();
        //CustomerFetch cf = new CustomerFetch();
        //CustomerFetch.getCustomers();

        for (Customer cust: CustomerFetch.getCustomers())
            System.out.println(cust);

    }
}
