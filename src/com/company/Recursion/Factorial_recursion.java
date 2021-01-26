package com.company.Recursion;

public class Factorial_recursion {
    public static  void main(String [] args){


        System.out.println(facto_Recursion(5));


    }
    static  int facto_Recursion(int n){

        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }

        return n*facto_Recursion(n-1);
    }
}
