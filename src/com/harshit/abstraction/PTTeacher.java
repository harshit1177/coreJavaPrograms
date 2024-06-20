package com.harshit.abstraction;

public class PTTeacher implements HomeWork {
    @Override
    public String giveHomework() {
        return "Do some running";
    }

    @Override
    public String giveExamTips() {
        return "There are no exams for you";
    }
}
