package com.harshit.loops;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 1;i<=number;i++){
            for(int j=1; j<=i ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("############################");
        for(int i = 1;i<=number;i++){
            for(int j=number; j>=i ;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("############################");

        int count = 1;
        for(int i = 1;i<=number;i++){
            for(int j=number; j>=i ;j--){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

       // Number of rows in the pattern
                char currentChar = 'A'; // Starting character

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(currentChar + " ");
                        currentChar++; // Move to the next character
                    }
                    System.out.println(); // Move to the next line after each row
                }
            }
        }




//
