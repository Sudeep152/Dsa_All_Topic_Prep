package com.company.BitManipulation;

public class right_Most_Bit {
    public static void main(String [] args ){
      countRightMost(5);

    }
    static void countRightMost(int n){
        int result=1;
        while (n>0){
            if (n%2!=0){
                System.out.println(result);
                break;
            }
            n=n/2;
            result++;

        }

    }
}

