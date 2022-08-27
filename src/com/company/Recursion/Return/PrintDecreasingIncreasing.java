package com.company.Recursion.Return;

import com.company.Recursion.PDI;

public class PrintDecreasingIncreasing {
    public static void main(String [] args){

        pDI(5);

    }
    static  void  pDI(int n ){

        if(n==0)return;

        System.out.println(n);
        pDI(n-1);
        System.out.println(n);



    }
}
