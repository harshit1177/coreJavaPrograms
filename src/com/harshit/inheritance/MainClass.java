package com.harshit.inheritance;

class First
{
    String name= "dummy";
    public  void staticMethod()
    {
        System.out.println("Static Method");
    }
}

public class MainClass extends First
{

//     String name = "Dummy2";

    public static void main(String[] args)
    {
        First first = new First();

        System.out.println(first.name);
        first.staticMethod();

        MainClass mainClass = new MainClass();
        System.out.println(mainClass.name);

    }
}