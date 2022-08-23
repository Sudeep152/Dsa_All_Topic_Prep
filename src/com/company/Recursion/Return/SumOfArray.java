package com.company.Recursion.Return;

public class SumOfArray {
    public  static  void  main(String [] args){

        int [] arr={1,2,3};

        System.out.println(arrSum(arr));
 System.out.println(betterSum(arr,0));
    }
    static  int arrSum(int [] arr ){
        int sum=0;
        if (arr.length==0){
            return 0;

        }
        int [] newSmallProb  = new int[arr.length-1];

        for (int i=1;i<arr.length;i++){
            newSmallProb[i-1] = arr[i];
        }

        sum= arr[0]+arrSum(newSmallProb);


        return sum;
    }

    static int betterSum(int []arr,int stater){
        if(stater == arr.length){
            return stater;
        }

        return stater+betterSum(arr,stater+1);
    }
}
