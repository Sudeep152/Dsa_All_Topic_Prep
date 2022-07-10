package com.company.DailyQuestions;

public class BuildArrayFromPermutation {
    public static  void main(String [] args){


         int [] arr ={5,0,1,2,3,4};
//        // int [] and= buildArray(arr);
//
//         for (int i =0;i<arr.length;i++){
//             System.out.println(and[i]);
//         }

        buildArray(arr);
    }

    static  void buildArray(int[] nums) {

        int n= nums.length;
        int  [] temp = new int[n];

        for (int i =0;i<n;i++){
            int ir= nums[i];
            temp[i]=  nums[ir];


        }


        for (int i=0;i<n;i++){
            System.out.print(temp[i] + " ");
        }






    }
}
