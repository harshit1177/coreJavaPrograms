package com.harshit.polymorphism;

public class Circle extends Dummy{

    public double calculateArea(int radius){
        System.out.println("inside the circle class");
        return 3.14 * radius * radius;
    }

}
