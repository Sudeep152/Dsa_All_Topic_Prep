package com.company.Array.OperationOnArray;

public class StockBuyAndSellOne {
    public static void main(String[]  args){

        int [] arr ={1,5,3,8,12};

        naiveSolution(arr);
    }

     static void naiveSolution(int [] arr){

//        int maxProfit=0;
//        int minSoFar=0;
//
//
//        for (int i=0;i<arr.length;i++){
//
//            minSoFar=Math.min(arr[i],minSoFar);
//            int profit = arr[i]-minSoFar;
//            maxProfit =Math.max(maxProfit,profit);
//
//        }
//
//        System.out.print(maxProfit);




         int profit=0;

         for (int i=1;i<arr.length;i++){

             if(arr [i]>arr[i-1]){
                 profit=profit+(arr[i]-arr[i-1]);
             }

         }

         System.out.print(profit);
     }
}
