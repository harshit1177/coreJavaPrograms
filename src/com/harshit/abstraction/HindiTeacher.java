package com.harshit.abstraction;

//class always uses extends keyword
// interface implements

public class HindiTeacher extends SchoolPeriods implements HomeWork {

    @Override
    public String giveHomework() {
        return "Read one page hindi lesson";
    }

    @Override
    public String giveExamTips() {
        return "Revise previous 2 years questions";
    }

    public String teacherName(){
        return "Abc";
    }

    @Override
    public int givePeriodNo() {
        return 3;
    }
}
