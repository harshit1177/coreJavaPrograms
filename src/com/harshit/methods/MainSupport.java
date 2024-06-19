package com.harshit.methods;

public class MainSupport {

    //method will have 1) access modifier, return type,
    // {int, double, string, arraylist, object}, name --> verb ,
    // parameter list inside the paranthsis.
   public int giveSum(int number1, int number2){
        return number1+number2;
    }

    //method name should be a verb , and it is in smaller camel casing.
   public int giveProduct(int number1, int number2, int number3){
       return number1*number2*number3;
    }


    public int  giveLargestNumber(int number1, int number2){

       if(number1 > number2) {
           return number1;
       }
       return  number2;

    }

    //a method will take string and return the length of the string.

    public int returnStringLength(String string){
       int length = string.length();
       return length;
    }


    //function accepts a no, and it return boolean result, if no is even return true, else it return false.
   public boolean checkEven(int number){

//       if(number%2==0){
//           return true;
//       }
//       return false;
       return (number%2==0)? true : false;
    }

    public int calculateFactorial(int num){
       int fact =1;
       for(int i=2;i<=num;i++){
           fact = fact*i;
       }
       return fact;
    }






}
