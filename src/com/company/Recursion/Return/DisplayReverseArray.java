package com.company.Recursion.Return;

public class DisplayReverseArray {
    public  static  void  main(String [] args){

        int  []ar= {1,2,3,4};
        reverse(ar,0);

    }
    static void  reverse(int [] arr ,int index ){

        if(index > arr.length-1){
            return;
        }

        reverse(arr,index+1);
        System.out.println(arr[index]);


    }
}
