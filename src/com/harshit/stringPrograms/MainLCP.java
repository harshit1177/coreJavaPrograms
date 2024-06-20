package com.harshit.stringPrograms;

import java.util.Arrays;

public class MainLCP {

    public static void main(String[] args) {

        String[] strings = {"flower","flow","flight"};
        String[] strings2 = {"dog", "Cat", "car"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        LongestPrefix longestPrefix = new LongestPrefix();
         int minLength = longestPrefix.minLength(strings);
         System.out.println(minLength);
         String result = longestPrefix.giveLongestCommonPrefix(strings2,minLength);
        System.out.println(result);


    }
}
