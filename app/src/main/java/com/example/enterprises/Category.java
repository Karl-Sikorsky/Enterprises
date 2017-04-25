package com.example.enterprises;

/**
 * Created by ПОДАРУНКОВИЙ on 17.04.2017.
 */

public class Category {
    String name;
    String type;
    String tel;
    int id;

    public Category(String name, String type, String tel, int id) {
        this.name = name;
        this.type = type;
        this.tel = tel;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


