package com.company.LeetCodeDailyQuestions;


public class PartitionArraytoPivot {
    public static void main(String  [] args){


        int [] ARR ={9,12,5,10,14,3,10};

        pivotArray(ARR,10);
    }
  static   public void pivotArray(int[] nums, int pivot) {
        int [] lessThanPivot=new int [nums.length];
        int [] greaterThanPivot = new int [nums.length];
        int n= nums.length;
        for(int i =0;i<n;i++){
            if(nums[i] <= pivot){
                lessThanPivot[i] = nums[i];
            }
            if(nums[i] > pivot){
                greaterThanPivot[i]= nums[i];
            }
        }

        for (int i =0;i<n ;i++){
            if(lessThanPivot[i]!=0){
                System.out.print(lessThanPivot[i]+ " ");
            }


        }
        for (int i =0;i<n ;i++){

            if (greaterThanPivot[i]!=0){
                System.out.print(greaterThanPivot[i]+ " ");
            }
        }


    }
}
