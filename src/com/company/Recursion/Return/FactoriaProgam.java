package com.company.Recursion.Return;

public class FactoriaProgam {
    public static void main(String [] args){

        System.out.println(Facto(5));


    }
    static  int Facto(int n){

        if (n==0)return 1;


        return  n* Facto(n-1);
    }
}
