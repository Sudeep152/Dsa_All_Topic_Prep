package com.company.BitManipulation;

public class Decimal_to_Binary {
    public static void main(String [] args){

        convert(67);

    }
    static void convert(int n){

        int value=0;

        for (int i=31;i>=0;i--){

            value=n>>i;

            if ((value & 1) ==1){
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }



    }
}
