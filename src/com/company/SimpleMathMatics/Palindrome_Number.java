package com.company.SimpleMathMatics;

public class Palindrome_Number {
    public static void main(String  []  args){

       System.out.println(PalindromeCheck(7997                                                                                              ));

    }
        static  int reverseNum(int n){
            int rem=0;
            int rev=0;
            while (n>0) {
                rem = n % 10;
                rev = rem + rev * 10;
                n = n / 10;
            }
            return rev;
        }
    static boolean PalindromeCheck(int n){

        if(n  == reverseNum(n)){
            return true;
        }
        else {
            return false;
        }

    }
}
