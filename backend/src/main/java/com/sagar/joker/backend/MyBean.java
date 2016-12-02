package com.sagar.joker.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    public String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}