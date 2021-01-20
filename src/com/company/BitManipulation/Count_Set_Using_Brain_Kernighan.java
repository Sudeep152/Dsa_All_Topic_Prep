package com.company.BitManipulation;

public class Count_Set_Using_Brain_Kernighan {
    public static void main(String [] args){

        //This is Famous Algorithm Which is called Brain Kernighan

        System.out.println(countBit(1));
    }
    static int countBit(int n){
        int count=0;
        while (n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
