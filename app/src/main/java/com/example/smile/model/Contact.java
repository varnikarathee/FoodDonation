package com.example.smile.model;

import android.content.Context;

public class Contact {
//    public float setPhonenumber;
//    public Context setName;
    private int id;
    private String name;
    private String phoneNumber;

    private String foodtype;

    private String expiry;

    public Contact(){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.foodtype= foodtype;
        this.expiry=expiry;

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getExpiry() {
        return expiry;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }


}

