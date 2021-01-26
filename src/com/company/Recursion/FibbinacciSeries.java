package com.company.Recursion;

public class FibbinacciSeries {
    public static void main(String [] args){


        System.out.println(fibo(3));

    }
    static int fibo(int n){

        if (n==0){
            return 0 ;
        }
        if (n==1){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
