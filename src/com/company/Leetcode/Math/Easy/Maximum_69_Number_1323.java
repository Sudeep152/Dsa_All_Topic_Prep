package com.company.Leetcode.Math.Easy;

public class Maximum_69_Number_1323 {
    public static void main(String [] args){


         System.out.println(  numberChnage(9696));

    }
    static  int numberChnage(int num){

        String number= String.valueOf(num);

        for (int i=0;i<number.length();i++){

            if (number.charAt(i)=='6'){
                String ret = number.substring(0, i) + '9' + number.substring(i+1);
                return Integer.parseInt(ret);
            }
        }
        return num;

    }
}
