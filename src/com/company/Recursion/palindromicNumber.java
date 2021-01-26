package com.company.Recursion;

public class palindromicNumber {
    public static void main(String [] args){

        System.out.println(palindrome(121));
    }
    static int reverse(int n,int temp){

        if (n==0){
            return temp;
        }
        int rem=0;
        rem=n%10;
        temp=temp*10+rem;

        return reverse(n/10,temp);

    }
    static  boolean palindrome(int n){

        int n1=reverse(n,0);

        if (n==n1){
            return true;
        }

        return false;
    }
}
