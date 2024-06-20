package com.harshit.abstraction;

//hiding the logic from outside world
//2 ways --> interface (100% abstraction)  , abstract classes(partial abstraction)

//define the method signature and not the method body.

//any no of default methods in interface.
//any class implementing the interface can use the default methods.

public interface HomeWork {

    public String giveHomework();

    //abstract methods that doesn't have body.
    public String giveExamTips();

    //default
    default String syllabusStatus(){
        return "syllabus is complete";
    }

    default int schoolVacationDays(String vacationType){
        if(vacationType.equalsIgnoreCase("summer")){
            return 60;
        }
        if(vacationType.equalsIgnoreCase("winter")){
            return 10;
        }
        return 0;
    }

}
