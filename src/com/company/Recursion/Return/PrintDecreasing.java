package com.company.Recursion.Return;

public class PrintDecreasing {
    public  static  void  main(String [] args){

        PDE(5);

    }
    static void  PDE(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        PDE(n-1);
    }
}
