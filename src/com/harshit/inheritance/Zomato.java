package com.harshit.inheritance;

public class Zomato extends Order{

    public void orderStatus(){
        System.out.println("Order placed successfully");
    }

    @Override
    public int giveBill(){
        return 200;
    }

}
