package com.example.kiosk;

public abstract class Product {


    public String getDescription(){
        return description;
    }
    public double getCost(){
        return cost;
    }



    protected String description=""; //자식클래스 접근가능
    protected double cost;

}
