package com.company.BinarySearch;

public class firstOccurrence {
    public static void main(String [] args){


        int [] arr = {5,7,7,8,8,10};
        System.out.println(getFirst(arr,8));

    }
    static  int getFirst(int [] nums, int target){

        int  start = 0;
        int end = nums.length-1;
        int firstIndex = -1;
        while (start<=end){
            int  mid = start + (end-start)/2;

            if(nums[mid]==target){
                firstIndex= mid;
                end = mid-1;
            }else if(nums[mid]>target){
                end= mid-1;
            }else{
                start =mid+1;
            }

        }

        return  firstIndex;
    }

}
