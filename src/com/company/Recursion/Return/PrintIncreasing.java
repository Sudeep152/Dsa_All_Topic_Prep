package com.company.Recursion.Return;

public class PrintIncreasing {
    public static  void main(String [] args){

        PI(5);


    }
    static void  PI(int n){
        if(n==0)return;

        PI(n-1);
        System.out.println(n);

    }
}
