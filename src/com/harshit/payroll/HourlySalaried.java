package com.harshit.payroll;

public class HourlySalaried extends Employee{

    private int noOfHours;

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    @Override
    public double calculatePay() {
        return getNoOfHours() * getSalary();
    }

    @Override
    public void displayDetails() {
        System.out.println(getEmployeeId()+" "+getName());
    }
}
