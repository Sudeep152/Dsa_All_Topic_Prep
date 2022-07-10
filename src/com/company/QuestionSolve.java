package com.company;

import java.util.ArrayList;

public class QuestionSolve {
    public static void main(String [] ars){

        int [] ar =
                {1,2,3,4,5,6,7};


        rotate(ar,4);

    }

    static  void rotate(int[] nums, int k) {

        int n = nums.length;
        int []temp =new int[k];
        ArrayList<Integer> arrayList= new ArrayList<>();

        for (int i=0;i<k;i++) {
            temp[i] = nums[k];
            nums[k] = nums[i];
        }
        for (int i=0;i<k;i++){
            arrayList.add(temp[i]);
        }

        for (int i=0;i<k;i++){
            arrayList.add(nums[i]);
        }

        System.out.println( "\n"+arrayList);




    }


}
