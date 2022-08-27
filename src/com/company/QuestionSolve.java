package com.company;

import java.util.ArrayList;

public class QuestionSolve {
    public static void main(String[] ars) {

      String []  strs = {"flower","flow","flight"};

      System.out.println(longestCommonPrefix(strs));

    }


   static public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) return "";

        String ans = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(ans) !=0){               // if ans string is not equal to the given string
                ans = ans.substring(0,ans.length()-1);    //cut the string from end
            }
        }
        return ans;
    }
}