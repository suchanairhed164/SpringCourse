package com.example.springcourse.cls;

import org.springframework.stereotype.Component;


public class Address {
    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    // getters and setters
}