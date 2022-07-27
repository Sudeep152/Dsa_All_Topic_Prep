package com.company.String;

public class SubsequenceOfOther {
    public static  void main(String [] args){


        String s1 ="ABC";
        String s2 = "";
       System.out.println(effSolution(s1,s2));
    }

//    static void  NaiveApproach (String s1,String s2){
//
//        for (int i =0;i<s1.length() ;i++){
//
//            System.out.println();
//            for (int j =i;j<s1.length();j++){
//                System.out.print(s1.charAt(j));
//            }
//
//        }
//
//
//
//    }


    static boolean effSolution(String s1 ,String s2){


        int n = s1.length();
        int m = s2.length();
        int j  = 0;

        for (int i=0; i<n && i <m ;i++){
            if (s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }

        return  (j==m);
    }
}
