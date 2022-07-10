package com.company;

public class InterViewQuestion {

    public static void main(String [] args){

        int [] ar ={2,3,10,6,4,8,1};
        System.out.println(maxDifference(ar));

    }

    static int maxDifference(int [] arr){
        int n= arr.length;
        int res = arr[1]- arr[0];

        for (int i=0;i<n-1;i++){

            for (int j=i+1;j<n;j++){
                res= Math.max(res,arr[j]-arr[i]);
            }
        }


        return res;



    }


}

