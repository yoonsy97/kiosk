package com.example.kiosk;

import java.util.Scanner;

public class kiosk {

    BeverageFactory beverageFactory;
    kiosk(){
        beverageFactory=new BeverageFactory();

    }
    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.println("주문하실 음료를 선택해주세요");
        System.out.println("1.에스프레소");

        String bev=scan.next();
        Beverage beverage = beverageFactory.createBeverage(bev);

        boolean flag=true;
        while(flag){
            System.out.println("데코를 골라주세요");
            System.out.println("1. 모카 2. 휘핑 3. 두유 4. 체리 5. 종료");
            int num=scan.nextInt();
            switch(num){
                case 1:
                    beverage=new Mocha(beverage);
                    break;
                case 2:
                    beverage=new Whip(beverage);
                    break;
                case 3:
                    beverage=new Soy(beverage);
                    break;
                case 4:
                    beverage=new Cherry(beverage);
                    break;
                default:
                    flag=false;
                    break;

            }
            System.out.println(beverage.getDescription()+"$ "+beverage.getCost());
        }


        System.out.println("총 액 : "+ beverage.getDescription()+"$ "+beverage.getCost());

    }

}
