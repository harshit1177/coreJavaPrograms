package com.harshit.LoanAccount;

public class HDFCLoan implements KYC{
    @Override
    public boolean doKYC(Person details) {
        if(details.getAdhaarNo()>0 || details.getPanCardNo().length()>0) {
            return true;
        }
        return false;
    }
}
