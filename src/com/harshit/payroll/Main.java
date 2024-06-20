package com.harshit.payroll;

public class Main {

    public static void main(String[] args) {

        SalariedEmployee employee1 = new SalariedEmployee();
        employee1.setEmployeeId(1);
        employee1.setName("employee1");
        employee1.setSalary(1000);
        System.out.println(employee1.calculatePay());
        employee1.displayDetails();

        HourlySalaried hourlySalaried = new HourlySalaried();
        hourlySalaried.setEmployeeId(2);
        hourlySalaried.setName("employee2");
        hourlySalaried.setNoOfHours(5);
        hourlySalaried.setSalary(100);
        System.out.println(hourlySalaried.calculatePay());
        hourlySalaried.displayDetails();
    }
}
