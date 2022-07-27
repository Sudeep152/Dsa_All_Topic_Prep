package com.company.Array.LeetcodeQuestion;

public class Majority_Element {

    public static void main(String [] args){


    }

   public static int majorityElement(int[] nums) {

        int count = 0;
        int n = nums.length;
        for (int i=0;i<n;i++){

            for (int j=i;j<n;j++){

                if (nums[i] ==nums[j]){
                    count++;
                }
            }
        }

        return count;
    }


}
