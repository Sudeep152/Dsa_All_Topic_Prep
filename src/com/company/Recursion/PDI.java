package com.company.Recursion;

public class PDI {
    public static void main(String [] args){

        PDI(5);

    }
    static  void  PDI(int n){

        if (n==0){
            return;
        }
        System.out.println(n);
        PDI(n-1);
        System.out.println(n);
    }


}
