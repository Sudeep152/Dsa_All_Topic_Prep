package com.company;

public class helu {
    public static void main(String [] args){


        System.out.println(odd(6713));

    }
    static int countSum(int n,int set){

        int count=0;
        int sum=0;
        int i=0;

        while (count!=n){
            int temp =countSetBits(i);
            if(temp==set){
                count++;
                sum= sum+i;
            }
            i++;
        }

        return sum;
    }
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }


    static int odd(int num){

        int oddSum=0;
        int evenSum=0;
        int max=1;
        while (num!=0){
            int id =num%10;
            if(id%2==0){
                evenSum=evenSum+id;
            }
            if(id%2!=0){
                oddSum=oddSum+id;
            }
            num= num/10;


        }
        max=Math.max(oddSum,evenSum);
        return max;

    }

}
