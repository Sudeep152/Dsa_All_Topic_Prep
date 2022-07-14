package com.company.Array.LeetcodeQuestion;

public class ProblemNO_2011 {
    public static void main(String[] args) {

        String [] arr={"--X","X++","X++"};

        System.out.print(finalValueAfterOperations(arr));

    }

    static int finalValueAfterOperations(String[] operations) {
        int n = operations.length;

        int count =0;
        for (int i =0;i<n;i++){
            if (operations[i].charAt(0)=='+' || operations[i].charAt(1)=='+' ){
                count=count+1;
            }else {
                count=count-1;
            }

        }

return  count;
    }
}