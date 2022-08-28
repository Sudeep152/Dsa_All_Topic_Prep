package com.company.Recursion.Return;

public class MaximumNumber {
    public static void  main(String [] args){

        int  [] arr  = {2,8,4,9};
        System.out.println(
                maxN(arr,0)
        );

    }
    static int maxN(int [] arr ,int index){
        if(arr.length-1 < index){
            return 0;
        }

        int ans =0;



        int x= maxN(arr,index+1);
        ans = Math.max(x,arr[index]);
                return ans;

    }
}
