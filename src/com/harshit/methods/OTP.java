package com.harshit.methods;

import java.util.Random;

public class OTP {

    public int giveOtp(){
        Random random = new Random( );
        return  1000 + random.nextInt(8999); //9999 //1000
    }


}
