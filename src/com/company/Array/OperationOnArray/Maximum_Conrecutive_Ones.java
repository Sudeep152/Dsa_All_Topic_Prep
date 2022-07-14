package com.company.Array.OperationOnArray;

public class Maximum_Conrecutive_Ones {
    public static  void main(String [] args){


        int [] arr ={0,1,1,0,0};
        System.out.println(NaiveSolution(arr));
        System.out.println(BestSolution(arr));

    }
    static int NaiveSolution(int [] arr ){

        int n= arr.length;
         int res =0;
        for (int i=0; i<n;i++){
            int curr=0;
            for (int j=i;j<n;j++){
                if (arr[j] ==1){
                    curr++;
                }else break;
            }

         res= Math.max(res,curr);
        }
return  res;

    }
    static int  BestSolution(int [] arr){
        int n = arr.length;
        int res=0;
        int curr=0;
        for (int i =0;i<n;i++){
            if (arr[i] ==0){
                curr=0;
            }else {
                curr++;
            }
        res = Math.max(res,curr);
        }

        return res;
    }
}
