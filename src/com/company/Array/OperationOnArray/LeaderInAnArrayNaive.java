package com.company.Array.OperationOnArray;

import java.util.ArrayList;

public class LeaderInAnArrayNaive {
    public static void main(String [] args){

        int [] arr={7,10,4,3,6,5,2};
        leaderOfArray(arr);
    }
    static void  leaderOfArray(int [] arr){


        int n =arr.length;
        for (int i=0;i<n ;i++ ){
           Boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }



            }
            if (flag==false ){
                System.out.print(arr[i]+ " ");
            }

        }

    }
}
