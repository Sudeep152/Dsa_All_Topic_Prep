package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Test {
    public static void main(String[] args) {

        ;
//        System.out.println(fun(2,7));

System.out.println(OddEvenSum(6713));
//System.out.println(getSum(6713));
//
    }

    static int OddEvenSum(int num){
        int oddSum=0;
        int evenSum=0;
        int max=1;

        while (num!=0){
            int ld= num%10;
            if(ld%2==0){
                evenSum=evenSum+ld;
            }
            if(ld%2!=0){
                oddSum=oddSum+ld;
            }
            num=num/10;
        }

        max= Math.max(oddSum,evenSum);

        return max;
    }
    static int  getSum(int n)
    {
        n = reverse(n);
        int sumOdd = 0, sumEven = 0, c = 1;

        while (n != 0) {

            // If c is even number then it means
            // digit extracted is at even place
            if (c % 2 == 0)
                sumEven += n % 10;
            else
                sumOdd += n % 10;
            n /= 10;
            c++;
        }

       return Math.max(sumEven,sumOdd);
    }
    static int reverse(int n)
    {
        int rev = 0;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }






}