package com.harshit.test;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char character = 'A';
        int no = scanner.nextInt();

        for (int i = 0; i < no; i++){
            for(int j=0;j<=i;j++){
                System.out.print(character+ " ");
                character++;
            }
            System.out.println();
        }

    }
}
