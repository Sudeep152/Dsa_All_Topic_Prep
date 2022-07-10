package com.company.DailyQuestions;

public class Shuffle_the_Array {
    public static void  main(String [ ] args){


        int [] arr= {2,5,1,3,4,7};
        shuffle(arr,3);
    }
    static  void   shuffle(int[] nums, int n) {

        int arrSize= nums.length;
        int [] temp = new int[arrSize];
        temp[0]=nums[0];
        for (int i=1;i<arrSize;i++){
            temp[i]=nums[n];
        }

        for (int i=0;i<arrSize;i++){
            System.out.println(temp[i]);
        }

    }

}
