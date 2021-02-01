package com.company.BitManipulation;

public class swapAllEvenAndOddBit {
    public static void main(String [] args){


        System.out.println(swapBit(23));
    }
    static int  swapBit(int n){

        int ODMask =0xAAAAAAA;
        int EvenMask=0x555555;

        int OBitZero=ODMask&n;
        int EBitZero=EvenMask&n;


        int result=0;
        result= (OBitZero>>1) | (EBitZero<<1) ;


        return result;

    }
}
