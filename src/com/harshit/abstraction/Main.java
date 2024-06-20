package com.harshit.abstraction;

public class Main {

    public static void main(String[] args) {

        KanadaTeacher kanadaTeacher = new KanadaTeacher();

        System.out.println(kanadaTeacher.giveHomework());
        System.out.println(kanadaTeacher.schoolVacationDays("summer"));

        HindiTeacher hindiTeacher = new HindiTeacher();
        System.out.println(hindiTeacher.schoolVacationDays("rainy"));
        System.out.println("Hindi Teacher period no is "+ hindiTeacher.givePeriodNo());

      }
    }
