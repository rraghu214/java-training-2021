package com.learning.jan._21.Serialize;

import java.io.OutputStream;
import java.io.Serializable;

public class Users  implements Serializable {
    private String username;
    private int age;
    private String place;

    public Users(String username, int age, String place) {
        this.username = username;
        this.age = age;
        this.place = place;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", place='" + place + '\'' +
                '}';
    }

}
