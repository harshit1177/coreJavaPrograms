package com.harshit.stringPrograms;

public class Main {

    public static void main(String[] args) {

        //Strings in java are immutable in nature. //cannot be changed
        String name = "abc";
        String name2 = "Abc";

        //.equals will compare the values of the two strings.
        // == will compare the address of the strings
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name==name2);
        name2 = "abc";
        System.out.println(name==name2);
        String string = new String("abc");
        System.out.println(string == name2);
        string = "abc"; //it will check in the thread pool and assigne the thread pool address
        System.out.println(string == name2);

        StringBuilder stringBuilder = new StringBuilder();
        String name3 = "";
        stringBuilder.append('H');
        stringBuilder.append('a');
        System.out.println(stringBuilder);
        name3="abc";
        System.out.println(name3);

        System.out.println(name3.compareTo(name));

        //String pool.

        //String using constructor

        // .equals and == methods



    }
}
