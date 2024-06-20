package com.harshit.polymorphism;

public class Dummy {

    public double calculateArea(double radius){
        System.out.println("inside the dummy class");
        return 3.14 * radius * radius;
    }
}


//Override --> with the help of inheritance and it will be runtime polymorphism
//Overload --> will happen at the compile time same method with different signature.

