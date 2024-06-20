package com.harshit.polymorphism;

public class Main {

    public static void main(String[] args) {

//preference will be given to the native method, own method.
        Circle circle = new Circle();
        double result =  circle.calculateArea(10.00);
        System.out.println(result);
    }

}
