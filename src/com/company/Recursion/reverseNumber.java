package com.company.Recursion;

public class reverseNumber {
    public static void main(String  []  args){

        System.out.println(reverse(123,0));

    }
    static int reverse(int n ,int tem){

        if (n==0){
            return tem;
        }
        int rev=0;
        rev=n%10;
        tem=tem*10+rev;

        return reverse(n/10,tem);

    }
}
