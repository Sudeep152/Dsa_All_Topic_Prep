package com.company.String;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {
    public static void main(String [] args){

        String  str = "geeksforgeeks";

        System.out.println(naiveApproach(str));


    }
    static int  naiveApproach(String str){

        int n = str.length();
        int [] countFreq = new int[256];

        for (int i  =0;i<n;i++){
            countFreq [str.charAt(i)]++;
        }
        for (int i = 0;i< n ;i++){
            if (countFreq[str.charAt(i)] ==1){
               return  i;
            }
        }

        return -1;

    }

}
