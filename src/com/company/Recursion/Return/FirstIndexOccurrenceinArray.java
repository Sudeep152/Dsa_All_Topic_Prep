package com.company.Recursion.Return;

public class FirstIndexOccurrenceinArray {
    public static void main(String [] args){


        int [ ] arr ={2,3,9,8,7,6,4,12,7,3,8};

        System.out.println(firstOcc(arr,0,8));
System.out.println(firstOccBest(arr,0,8));
    }

    static int firstOcc(int [] arr,int index,int d){

        ///This is not  a good approach
        if(index > arr.length-1){
            return -1;
        }

        int value= firstOcc(arr,index+1,d);

        if(d == arr[index]){
            return index;
        }else {
            return value;
        }


    }

    static  int firstOccBest(int [] ar ,int index,int data){

        if(index> ar.length){
            return  -1;
        }



         if(data == ar[index]){
             return  index;
         }
         else {
             int smallFaith= firstOccBest( ar,index+1,data);
             return  smallFaith;
         }


    }
}
