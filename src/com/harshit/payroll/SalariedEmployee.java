package com.harshit.payroll;

public class SalariedEmployee extends Employee{

    @Override
    public double calculatePay() {
        return getSalary();
    }

    @Override
    public void displayDetails() {
        System.out.println(getEmployeeId()+" "+getSalary()+ " "+ getName());
    }
}
