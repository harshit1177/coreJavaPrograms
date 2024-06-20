package com.harshit.abstraction;

//in order to make a class abstract we write the abstract keyword
// normal methods
public abstract class SchoolPeriods {

    //abstract method cannot be private
    public abstract int givePeriodNo();

    public String givePeriodNo(String day){
        if(day.equalsIgnoreCase("Sunday")){
            return "Holiday";
        }
        return "go visit the schedule";
    }
}
