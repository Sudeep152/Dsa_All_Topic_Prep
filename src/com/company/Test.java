package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5};
        arraySign(arr,5);


//
    }
     static void  arraySign(int[] nums,int s) {

        int n = nums.length;
        int sum =0;
        int iIndex=0;
        int JIndex=0;
        for (int i =0;i<n;i++){

            while (sum!=s){
                sum=sum+nums[i];
            }

        }
        System.out.println();


    }



}