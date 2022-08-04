package com.company.SlidingWindow.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Sliding_Window_Maximum {
    public static void main(String [] args){

        int [] arr ={3,1,-1,-3,5,3,6,7};
        int k =3;
        maxSlidingWindow(arr,k);

    }
    static void maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        long [] res = new long[nums.length - k +1];
        int end=0;
        int start=0;
        int i =0;
        Queue<Integer> list=new LinkedList<>();;
        int  max =Integer.MIN_VALUE;
        while (end<n){

            if (max < nums[end]){
                max=nums[end];
                list.add(max);
            }

            if (end-start+1 !=k){
                end++;
            }else {


                    start++;
                    end++;

            }



        }


        for (int j =0;j<res.length;j++){
            System.out.println(res[i]);
        }



    }
}
