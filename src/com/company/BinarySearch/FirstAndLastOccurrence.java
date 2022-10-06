package com.company.BinarySearch;

public class FirstAndLastOccurrence {

    public static  void main(String [] args){

        int [] arr = {2,4,10,10,10,18,20};
        int [] answer= searchRange(arr,10);
        for (int i =0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }

    static public int[] searchRange(int[] nums, int target) {

        int firstIndex =-1;
        int lastIndex = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;

            if(nums[mid]==target){
                firstIndex= mid;
                end = mid-1;
            }else if(nums[mid]>target){
                end= mid-1;
            }else{
                start =mid+1;
            }
        }
        int start1 = 0;
        int end1 = nums.length-1;

        while(start1<=end1){

            int mid=start1 +(end1-start1)/2;

            if(nums[mid]==target){
                lastIndex= mid;
                start1 = mid+1;
            }else if(nums[mid]>target){
                end1= mid-1;
            }else{
                start1 =mid+1;
            }



        }




        int [] answer={firstIndex,lastIndex};

        return answer;


    }

}
