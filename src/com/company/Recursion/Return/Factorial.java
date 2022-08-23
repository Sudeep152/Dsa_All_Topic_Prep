package com.company.Recursion.Return;

public class Factorial {
    public  static  void  main(String [] args){

        System.out.println(facto(5));
    }
    static int facto(int n){
        if(n==0){
            return 1;
        }

        return  n*facto(n-1);

    }
}
