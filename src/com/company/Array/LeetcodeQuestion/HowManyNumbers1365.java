package com.company.Array.LeetcodeQuestion;

public class HowManyNumbers1365 {
    public static void main(String [] args){


        int []ar ={8,1,2,2,3};
        int []temp =smallerNumbersThanCurrent(ar);

        for (int i=0;i<temp.length;i++){
            System.out.print (temp[i]+ " ");
        }


    }
    static  int[] smallerNumbersThanCurrent(int[] nums) {


        int  n= nums.length;
        int [] temp =new int[n];


        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<n;j++){
                if (nums[i]>nums[j]){
                    count++;
                }

                temp[i]= count;
            }



        }

        return temp;



    }
}
