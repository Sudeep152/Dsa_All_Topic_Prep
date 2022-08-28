package com.company.Recursion.Return;

public class DisplayArray {
    public static void main(String  [ ] args){
        int [] arr ={1,2,3,4};
       // Display(arr);
        helloDi(arr,0);
    }
    static void  helloDi(int [] arr,int index){

        if (arr.length-1 <index)return;


        System.out.println(arr[index]);
        helloDi(arr,index+1);


    }
}
