package com.harshit.payroll;

import java.util.Locale;

public abstract class Employee {

    private int employeeId;

    private String name;

    private double salary;

    public abstract double calculatePay();

    public abstract void displayDetails();

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
