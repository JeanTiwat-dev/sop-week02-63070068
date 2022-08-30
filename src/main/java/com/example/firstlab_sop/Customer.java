package com.example.firstlab_sop;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public Customer() {
        this.ID = "";
        this.name = null;
        this.sex = false;
        this.age = 0;
    }

    public Customer(String ID, String n, boolean s, int a) {
        this.ID = ID;
        this.name = n;
        this.sex = s;
        this.age = (a < 0 ) ? 0 : a;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
