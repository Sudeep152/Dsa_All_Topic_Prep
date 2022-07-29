package com.company.SlidingWindow.LeetCode;

public class Sliding_Window_Maximum {
    public static void main(String [] args){

        int [] arr ={5,4,3,2,1};
        int k =3;
        maxSlidingWindow(arr,k);

    }
    static void maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int j=0;
        int i=0;
        int [] res = new int[n];
        int  max =nums[i];
        while (j<n){
            max = Math.max(max,nums[j]);
            if (j-i+1 !=k){
                j++;
            }else {

                res[i]=max;
                max=res[j];
                i++;
                j++;
            }



        }



        for (int ll=0;ll<n;ll++){

            System.out.println(res[ll]);
        }



    }
}
