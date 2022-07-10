package com.company.Array.OperationOnArray;

public class TrappingWater {

   public static void main(String [] args){

        int [] arr={3,0,1,2,5};
        TappingWater(arr);


    }
    static  void   TappingWater(int [] arr){
        int n= arr.length;

        for (int i=1;i<n-1;i++){

            int Lmax=arr[i];
            for (int j=0;j<i;j++){

                Lmax = Math.max(Lmax,arr[j]);
            }
            int Rmax=arr[i];

            for (int j=i+1;j<n;j++){
                Rmax = Math.max(Rmax,arr[j]);
            }
            System.out.println(Lmax);
            System.out.println(Rmax);
        }





    }
}
