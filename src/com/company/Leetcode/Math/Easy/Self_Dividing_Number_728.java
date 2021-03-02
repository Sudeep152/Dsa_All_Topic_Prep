package com.company.Leetcode.Math.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Self_Dividing_Number_728 {
    public static void main(String [] args){

        selfNumber(1,22);
    }
    static ArrayList  selfNumber(int left,int right){

        ArrayList arrayList=new ArrayList();

        for (int i=left;i<=right;i++){

            if (selfDivide(i)){
                arrayList.add(i);
            }
        }
        return arrayList;

    }

    private static boolean selfDivide(int n) {
        int x=n;
        int current=0;

        while (n>0){
            current=n%10;

            if (current==0){
                return false;
            }
            if (x%current !=0){
                return false;
            }
            n=n/10;

        }
return true;

    }
}
