package com.company.BitManipulation;

public class setKthBit {
    public static void main(String [] args){
        setKthBit(10,2);


    }
    static void setKthBit(int  n,int k){

        if ((n & (1<<k))!=0){
            System.out.println("Set");
        }else {
            System.out.println("Not set");
            n=n | (1<<k);
            System.out.println(n);
        }


    }
}
