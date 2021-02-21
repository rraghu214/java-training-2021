package com.assignments.miniproject;

import com.assignments.miniproject.dao.MyConnection;

public class TestDB {
    public static void main(String[] args) {
        MyConnection.connect();
    }
}
