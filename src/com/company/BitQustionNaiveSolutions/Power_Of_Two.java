package com.company.BitQustionNaiveSolutions;

public class Power_Of_Two {
    public static void main(String [] args){

        System.out.println(powOfTwo(16));

    }
    static Boolean powOfTwo(int n){

        if(n==1){
            return false;
        }
        while (n!=1){
            if (n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }

}
