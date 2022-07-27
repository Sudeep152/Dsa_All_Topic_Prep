package com.company.Array.LeetcodeQuestion;

public class Plus_One {
    public static void main(String [] args){

        int [] ar={1,2,3};

        plusOne(ar);
    }
    static void plusOne(int[] digits) {
        int n = digits.length;
        int [] answer = new int[n+1];
        int temp=0;
        for (int i=0;i<n;i++){
            temp = digits[i] +temp*10;

        }
        temp= temp+1;

        for (int i =0;i<n;i++){


                int last= temp%10;
                answer[i]=last;
                temp=temp/10;



        }

      for (int  i= n;i>0;i--){
          System.out.print(answer[i]+ " ");
      }

    }
}
