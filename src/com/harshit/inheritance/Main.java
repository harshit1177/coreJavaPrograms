package com.harshit.inheritance;

public class Main {

    public static void main(String[] args) {

        Swiggy swiggy = new Swiggy();
        swiggy.orderStatus();
        System.out.println(swiggy.giveBill());

        Zomato zomato = new Zomato();
        System.out.println(zomato.giveBill());
        zomato.orderStatus();
    }
}
