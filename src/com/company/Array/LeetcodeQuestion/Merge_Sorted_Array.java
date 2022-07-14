package com.company.Array.LeetcodeQuestion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge_Sorted_Array {
    public  static  void main(String [] args){

        int  [] ar = {1,2,3,0,0,0};
        int  m = 3; int [] nums2 = {2,5,6}; int n = 3;

        merge(ar,m,nums2,n);




    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nm1Size = nums1.length;
        int num2Size= nums2.length;

        for (int i=0 ;i<n;i++){

            nums1[i+m] = nums2[i];
        }


        Arrays.sort(nums1);
        for (int i =0;i<nm1Size;i++){
            System.out.print("["+nums1[i]+ " ");
        }

    }
}
