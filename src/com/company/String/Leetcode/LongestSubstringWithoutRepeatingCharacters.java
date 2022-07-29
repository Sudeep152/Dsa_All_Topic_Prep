package com.company.String.Leetcode;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

    System.out.println( lengthOfLongestSubstring("pwwkew"));
//
//        lengthOfLongestSubstring("pwwkew");
    }

    static int lengthOfLongestSubstring(String s) {

        int n = s.length();
      int count=0;
        for (int i =0;i<n;i++){


            for (int j=i+1;j<n;j++){
                if (s.charAt(i) != s.charAt(j)){
                    count++;
                }

            }
        }

        return count;
    }
}
