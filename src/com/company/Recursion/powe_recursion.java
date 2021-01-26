package com.company.Recursion;

public class powe_recursion {
    public static  void main(String [] args){

        System.out.println(power_recersion(2,4));
    }
    static int power_recersion(int n,int p){

        if (p==0){
            return 1;
        }


        return  n*(power_recersion(n,p-1));
    }
}
