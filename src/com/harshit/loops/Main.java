package com.harshit.loops;

public class Main {

    public static void main(String[] args) {

        //loops a) for loop, b) while loop, c) do-while loop
        //
        int i = 1, j;
        //nested loops
        //
        //loop inside a loop

        for (i = 0; i < 3; i++) { //3 times 0,1,2
            for (j = 0; j < 2; j++) { // 2 times 0,1 total 6 times
                System.out.println(i + " " + j);
            }
        }
    }}



