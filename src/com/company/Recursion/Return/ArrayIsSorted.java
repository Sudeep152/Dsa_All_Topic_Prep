package com.company.Recursion.Return;

public class ArrayIsSorted {
    public  static  void  main(String [] args){

        int [] ar ={1,2,3,4};
        int [] ar2 ={12,3,4};

        System.out.println(sortCheck(ar));
        System.out.println(checkSort_2(ar2));
    }
    static boolean sortCheck(int [] arr){

        if(arr.length ==0||arr.length==1){
            return true;
        }
        int [] small  = new int[arr.length-1];
        for (int i=1;i<=small.length;i++){
            small[i-1] = arr[i];
        }
       boolean ans =   sortCheck(small);
        if(!ans){
            return false;
        }
        if(arr[0] <= arr[1]){
            return true;
        }else {
            return false;
        }


    }

    static  boolean checkSort_2(int [] arr){

        if(arr.length ==0 || arr.length ==1){
            return  true;
        }
        if(arr [ 0] >=arr [1]){
            return false;
        }
        int [] small  = new int[arr.length-1];
        for (int i=1;i<=small.length;i++){
            small[i-1] = arr[i];
        }
        boolean ans =   sortCheck(small);

        return  ans;


    }
}
