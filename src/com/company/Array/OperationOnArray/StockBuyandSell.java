package com.company.Array.OperationOnArray;

public class StockBuyandSell {
    public static void main(String  [] args){


        int[]arr = {10,20,30};
        System.out.println(StockBuy(arr));

    }


    static  int StockBuy(int [] arr ){
        int profit= 0;
        int n = arr.length;



        for(int i=1;i<n;i++){
            if (arr[i] >arr[i-1]){

                profit=profit+arr[i]-arr[i-1];
            }
        }

        return  profit;




    }
}

