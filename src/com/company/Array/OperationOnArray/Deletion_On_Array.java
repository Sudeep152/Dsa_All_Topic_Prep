package com.company.Array.OperationOnArray;

public class Deletion_On_Array {
    public static void main(String [] args){


        int [] arr={1,2,4,5};
        int n=arr.length;
        int x=2;
        System.out.println("Before Deletion");
        for (int i=0;i<n;i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println("After Deletion");
      n=  Deletion(arr,n,x);

        for (int i=0;i<n;i++){

            System.out.print(arr[i]+" ");

        }


    }
    static int Deletion(int [] arr,int n,int x){

        int i=0;
        for ( i=0;i<n;i++){
            if(arr[i]== x){
                break;
            }
        }
        if(i == n){
            return n;
        }

        for (int j=i;j<n-1;j++){
            arr[j]=arr[j+1];


        }

        return n-1;

    }
}
