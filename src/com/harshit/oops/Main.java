package com.harshit.oops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        Scanner scanner = new Scanner(System.in);
        int rollNo;
        String firstName;
        String lastName;

        System.out.println("enter rollno");

        rollNo = scanner.nextInt();
        System.out.println("enter firstName");
        firstName = scanner.next();

        System.out.println("enter lastName");
        lastName = scanner.next();

        student1.setRollNo(rollNo);
        student1.setFirstName(firstName);
        student1.setLastName(lastName);



        System.out.println(student1.getRollNo() + " " + student1.getFirstName() + " "+ student1.getLastName() );
    }
}
