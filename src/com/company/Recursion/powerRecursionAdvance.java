package com.company.Recursion;

public class powerRecursionAdvance {
    public static  void main(String [] args){

  System.out.println(power_advance(2,5));

    }
    static  int power_advance(int n,int p){

        if (p==0){
            return 1;
        }
        if (p==1){
            return n;
        }
        if (p%2==1){

            return  n*power_advance(n,p/2)*power_advance(n,p/2);
        }

        return power_advance(n,p/2)*power_advance(n,p/2);

    }
}
