package com.company.Recursion;

public class decimalToBinary {
    public static void main(String [] args){


        binaryDecimal(4);

    }
    static  void binaryDecimal(int n){

        if (n==0){
            return;
        }


        binaryDecimal(n/2);
        System.out.print(n%2);

    }
}
