package com.harshit.abstraction;

public class KanadaTeacher implements HomeWork {

    @Override
    public String giveHomework() {
        return "Read one page of Kanada Lesson";
    }

    @Override
    public String giveExamTips() {
        return "Skip Long questions";
    }

}
