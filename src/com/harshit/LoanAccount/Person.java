package com.harshit.LoanAccount;

public class Person {

   private   long loanAccountNo;

   private long adhaarNo;

   private String panCardNo="";

    public long getLoanAccountNo() {
        return loanAccountNo;
    }

    public void setLoanAccountNo(long loanAccountNo) {
        this.loanAccountNo = loanAccountNo;
    }

    public long getAdhaarNo() {
        return adhaarNo;
    }

    public void setAdhaarNo(long adhaarNo) {
        this.adhaarNo = adhaarNo;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public void setPanCardNo(String panCardNo) {
        this.panCardNo = panCardNo;
    }
}
