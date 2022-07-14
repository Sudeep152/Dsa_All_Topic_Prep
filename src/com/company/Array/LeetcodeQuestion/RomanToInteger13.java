package com.company.Array.LeetcodeQuestion;

import java.util.HashMap;

public class RomanToInteger13 {
public static void  main(String  [] args){


       System.out.println(romanToInt("MCMXCIV"));

}
static int romanToInt(String s) {

    HashMap<Character,Integer> myDis = new HashMap<>();
    myDis.put('I',1);
    myDis.put('V',5);
    myDis.put('X',10);
    myDis.put('L',50);
    myDis.put('C',100);
    myDis.put('D',500);
    myDis.put('M',1000);

   int n = s.length()-1;
    int  sum = myDis.get(s.charAt(n));

    for (int i =n-1;i>=0;i--){
       if (myDis.get(s.charAt(i)) >=myDis.get(s.charAt(i+1))){
           sum = sum+myDis.get(s.charAt(i));
       }else {
             sum -= myDis.get(s.charAt(i));
       }
   }

    return sum;












}

   static int removeDuplicates(int[] nums) {

        int n  = nums.length;
        int value = nums[n-1];

        for(int i =0;i<n;i++){
            if(nums[i]!=value){

                nums[i]=nums[value];
                value--;
            }
        }

        return value;

    }

}

