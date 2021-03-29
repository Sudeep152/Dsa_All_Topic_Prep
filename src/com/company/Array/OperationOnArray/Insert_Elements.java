package com.company.Array.OperationOnArray;

public class Insert_Elements {
    public static void main(String [] args){

        int [] arr= new int[5];
        int cap =5 ; int  n=4;
      arr[0]=1 ; arr[1]=2 ;
      arr[2]=3 ; arr[3]=4 ;
      System.out.println("Before Insertion");
      for (int i =0 ;i<n;i++){
          System.out.print(arr[i]+" ");
      }

      System.out.println();
      System.out.println("After Insertion");

      n = insert(arr,n,5,cap,2);

      for (int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
      }



    }
    static  int  insert(int arr [],int n,int x,int cap,int pos){

        if(n==cap){
            return  n;
        }
        int index = pos-1;
        for (int i=n-1;i>=index;i--){
            arr[i+1]=arr[i];


        }
        arr[index]= x;
        return  (n+1);

    }
}
