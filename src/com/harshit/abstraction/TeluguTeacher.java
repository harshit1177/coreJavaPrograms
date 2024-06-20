package com.harshit.abstraction;

public class TeluguTeacher implements HomeWork{

    @Override
    public String giveHomework() {
        return "Do one page of reading";
    }

    @Override
    public String giveExamTips() {
        return "practice previous years questions";
    }
}
