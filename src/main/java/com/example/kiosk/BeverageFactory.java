package com.example.kiosk;

public class BeverageFactory {

    public Beverage createBeverage(String type){
        Beverage beverage=null;
        if(type.equals("Espresso")) beverage=new Espresso();

        return beverage;
    }

}
