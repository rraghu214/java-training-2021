package com.assignments.miniproject.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {

    public static boolean ValidateTitle(String s){
        String regex = "[a-zA-Z0-9]{3,}$";
        Pattern p =  Pattern.compile(regex);
        Matcher m = p.matcher(s);
        System.out.println(m.matches());
        return m.matches();
    }
    public static boolean ValidateID(int id){
        System.out.println(id > 0);
        return id > 0;
    }

//    public static void main(String[] args) {
//        String s = "Ab$3";
//        ValidateTitle(s);
//        int id = 23;
//        ValidateID(id);
//    }
}
