package com.example.enterprises;

/**
 * Created by ПОДАРУНКОВИЙ on 17.04.2017.
 */

public class Category {
    String desription;
    int id;

    public Category(String desription, int id) {
        this.desription = desription;
        this.id = id;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


