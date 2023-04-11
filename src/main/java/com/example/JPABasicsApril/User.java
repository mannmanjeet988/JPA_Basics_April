package com.example.JPABasicsApril;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity                         // To create table for the class
@Table(name="user_info")      // To change the table name
public class User {

    @Id
    int userId;
    private  String name;

    private int age;

    private String mobile;

    public User(){

    }

    public User(int userId, String name, int age, String mobile) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

