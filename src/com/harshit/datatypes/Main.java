package com.harshit.datatypes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of number1");
        int number1;
        number1 = scanner.nextInt();
        System.out.println(number1);

        System.out.println("enter the value of number2 float");
        float number2;
        number2 = scanner.nextFloat();
        System.out.println(number2);

        System.out.println("enter the name");
        String name;
        name = scanner.next();
        System.out.println(name);

        System.out.println("enter the character value");
        char c;
        c = scanner.next().charAt(0);
        System.out.println(c);

        System.out.println("enter the boolean value");
        boolean bool;
        bool = scanner.nextBoolean();
        System.out.println(bool);

        System.out.println("enter the number3 value double");
        double number3;
        number3= scanner.nextDouble();
        System.out.println(number3);

        System.out.println("enter the phone no");
        long phoneNo = scanner.nextLong();
        if(phoneNo>6000000000l && phoneNo < 9999999999l){
            System.out.println("valid phone no");
        }
        else
            System.out.println("invalid phone no");
    }
}
