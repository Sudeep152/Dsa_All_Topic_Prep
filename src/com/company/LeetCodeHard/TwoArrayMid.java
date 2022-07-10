package com.company.LeetCodeHard;

import java.util.HashSet;

public class TwoArrayMid {
    public static void main(String [] args){


        int [] ar= {  1,2,3};
        int [] ar2={4,5,7,8};
        HashSet<Integer> h = new HashSet<>();
        double ans ;

        for (int i =0;i<ar.length;i++){
            h.add(ar[i]);

        }
        for (int i =0;i<ar2.length;i++){
            h.add(ar2[i]);
        }

        if ( ar.length %2!=0){
            System.out.println((ar[ar.length/2]));
        }else {
            int sum = 0;
            for (int i = 0; i < ar.length; i++)
                sum += ar[i];


            System.out.println((double)sum / (double)ar.length);
        }
        System.out.println(h);



    }
//    static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//
//
//    }
}
