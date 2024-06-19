package com.harshit.methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MainSupport mainSupport = new MainSupport();
       int result =  mainSupport.giveSum(10,20);
        System.out.println(result);

        OTP otp = new OTP();
        int otpValue= otp.giveOtp();
        System.out.println(otpValue);

        RandomPassword randomPassword = new RandomPassword();
        String password = randomPassword.generatePassword();
        System.out.println(password);

        int product = mainSupport.giveProduct(10,20,30);
        System.out.println(product);
        int largerNo = mainSupport.giveLargestNumber(12,24);
        System.out.println(largerNo);

      int length =   mainSupport.returnStringLength("Harshit");
        System.out.println(length);

        int factorialValue = mainSupport.calculateFactorial(3);
        System.out.println(factorialValue);
    }



}


//perform addition..
//int result = a+b; //100 times
