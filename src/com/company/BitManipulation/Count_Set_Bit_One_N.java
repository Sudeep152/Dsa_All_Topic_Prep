package com.company.BitManipulation;

public class Count_Set_Bit_One_N {

    public static void main(String []  args){

        one_to_N(5);

    }
    static void one_to_N(int n){
           int AllSetBit=0;
        for (int i=1;i<=n;i++){
            System.out.println(countSetBit(i));
            AllSetBit=AllSetBit+countSetBit(i);

        }
        System.out.println("\n 1 Se le Kr N Tk total set bit "+AllSetBit);

    }
    static int countSetBit(int n){
        int count=0;
        while (n>0){

            count++;
            n=n&(n-1);
        }
    return count;

    }
}
