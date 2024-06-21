package com.harshit.test;

import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();

        boolean isPrime = true;

        if(no==2){
            System.out.println("prime no");
        }
        else  {
            for (int i = 0; i <= no / 2; i++) {
                if (no % i == 0) {
                    isPrime = false;
                   // return;
                }
            }
        }
        if(isPrime && no>2){
            System.out.println("No is  prime");
        }
        else {
            System.out.println("no is not prime");
        }


    }
}
