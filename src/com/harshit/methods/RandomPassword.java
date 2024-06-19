package com.harshit.methods;

import java.security.SecureRandom;
import java.util.Random;

public class RandomPassword {

    private final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";

    public String generatePassword(){

        SecureRandom random = new SecureRandom();
        StringBuffer sb = new StringBuffer();

        // Ensure the password length is at least minLength
        while (sb.length() < 8) {
            int randomIndex = random.nextInt(CHARACTERS.length()); //picking a random index of characters string.
            sb.append(CHARACTERS.charAt(randomIndex)); //adding the character present at the random index.
        }

        return sb.toString();
    }
}
