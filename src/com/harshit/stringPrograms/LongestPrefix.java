package com.harshit.stringPrograms;

public class LongestPrefix {

    public int minLength(String[] strings){

        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<strings.length;i++){
            if(minLength > strings[i].length())
                minLength = strings[i].length();
        }
        return minLength;
    }

    public String giveLongestCommonPrefix(String[] strings,int minLength){

        String longestCommonPrefix = "";
        String dummyString = strings[0];
        for(int i=0;i<minLength;i++){
            for(int j=0;j< strings.length;j++){
                if(dummyString.charAt(i)==strings[j].charAt(i)){
           //         longestCommonPrefix += dummyString.charAt(i);
                      if(j== strings.length-1) {
                        longestCommonPrefix += dummyString.charAt(i);
                   }
                }
                else{
                    return longestCommonPrefix;
                }

            }
        }
        return longestCommonPrefix;
    }
}
