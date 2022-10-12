package com.company;

public class HelloBRo {
    public  static  void main(String [] args){


    int a =511709;
    int sum =0;
    while (a!=0){
        int x =a%10;
        sum+=x;
        a=a/100;
    }
        System.out.println(sum);



    }

    static int test(int [] arr){
        if (arr.length==0)return 0;
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }


}

