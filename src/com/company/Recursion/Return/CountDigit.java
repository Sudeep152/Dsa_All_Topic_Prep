package com.company.Recursion.Return;

public class CountDigit {
    public  static  void  main(String [] args){

        System.out.println(count(124));


    }

    static  int count (int n ){


        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int c =count(n/10);
        return c+1;
    }
}
