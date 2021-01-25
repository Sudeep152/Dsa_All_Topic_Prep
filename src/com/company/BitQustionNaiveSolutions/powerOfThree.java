package com.company.BitQustionNaiveSolutions;

public class powerOfThree {
    public static void main(String [] args){


        System.out.println(powerOfThree(0));

    }
    static  boolean powerOfThree(int n){


        while (n!=1){

            if(n%3!=0){
                return false;
            }

            n=n/3;
        }
        return true;



    }

}
