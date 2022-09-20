package com.company.Array;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Stack;

public class Siddhant {
    public static void main(String [] args){


       int []arr={0};
        getHeight(arr);
//        String str= "IDIDI";
//        String re= getSequence(str);
//        System.out.println(re);

    }
    static  void getHeight(int[]heights){

        int n= heights.length;

        if (n==1){
            System.out.println("no");
        }else {
            for (int i = 1; i < n; i++) {
                int j;
                for (j = i - 1; j >= 0; j--) {
                    if (heights[j] < heights[i]) {
                        System.out.print(heights[j] + " ");
                        break;
                    }
                }
                if (j == -1)
                    System.out.print("-1 ");
            }

        }



    }


    static String getSequence(String str){

        String result = "";
        Stack<Integer> stk = new Stack<Integer>();
        for (int i = 0; i <= str.length(); i++) {
            stk.push(i + 1);
            if (i == str.length() || str.charAt(i) == 'I') {
                while (!stk.empty()) {
                    result += String.valueOf(stk.peek());
                    result += "";
                    stk.pop();
                }
            }
        }
        return result;

    }

}
