package com.example.kiosk;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    protected String deco="";
    protected double addcost;


    public String getDescription(){
        return beverage.getDescription()+"+"+deco;
    }
    public double getCost(){

        return beverage.getCost()+addcost;
    }

}

class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage=beverage;
        addcost=.20;
        deco="모카";
    }
}

 class Soy extends CondimentDecorator{
   public Soy(Beverage beverage) {
            this.beverage = beverage;
            addcost=0.15;
            deco="두유";
        }

    }

class Whip extends CondimentDecorator{

        public Whip(Beverage beverage) {
            this.beverage = beverage;
            addcost=0.25;
            deco="휘핑";
        }

}
class Cherry extends  CondimentDecorator{
    public Cherry(Beverage beverage){
        this.beverage=beverage;
        addcost=1.0;
        deco="체리";
    }

}


