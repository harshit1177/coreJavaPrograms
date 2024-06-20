package com.harshit.LoanAccount;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setLoanAccountNo(12345);
        person1.setAdhaarNo(94637123);
        person1.setPanCardNo(null);

        Person person2 = new Person();
        person2.setLoanAccountNo(987654);
        person2.setAdhaarNo(0);
        person2.setPanCardNo("ABC1234A");

        Person person3 = new Person();

        HDFCLoan hdfcLoan = new HDFCLoan();
        if(hdfcLoan.doKYC(person1)){
            System.out.println("KYC done");
        }
        else{
            System.out.println("KYC pending");
        }

        SBILoan sbiLoan = new SBILoan();
        if(sbiLoan.doKYC(person2)){
            System.out.println("KYC done");
        }
        else{
            System.out.println("KYC pending");
        }

        SBILoan sbiLoan2 = new SBILoan();
        if(sbiLoan2.doKYC(person3)){
            System.out.println("KYC done");
        }
        else{
            System.out.println("KYC pending");
        }
    }
}
