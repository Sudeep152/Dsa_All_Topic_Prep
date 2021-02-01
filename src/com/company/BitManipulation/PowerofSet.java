package com.company.BitManipulation;

public class PowerofSet {
    public static void main(String [] args){

        subsets("");

    }
    static  void subsets(String str){

        int n=str.length();
        int length= (int) Math.pow(2,n);
        for(int counter=0;counter<length;counter++){

            for (int i=0;i<n;i++){
                if ((counter & (1<<i))!=0){
                    System.out.print(str.charAt(i));
                }
            }

            System.out.println();

        }


    }
}
