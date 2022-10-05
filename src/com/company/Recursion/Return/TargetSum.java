package com.company.Recursion.Return;

public class TargetSum {
    public  static  void main(String [] args){


        int [ ]ar= {1,2,3,4};
        PrintTargetSumSet(ar,0,"",0,7);
    }
    static void  PrintTargetSumSet(int [] arr,int idx, String ans,int sum , int target){

        if (arr.length==idx)
        {
            if (sum==target){
                System.out.println(ans +".");
            }

            return;
        }

        PrintTargetSumSet(arr,idx+1,ans+arr[idx]+ " ",sum+arr[idx],target);
        PrintTargetSumSet(arr,idx+1,ans,sum,target);
    }

}
