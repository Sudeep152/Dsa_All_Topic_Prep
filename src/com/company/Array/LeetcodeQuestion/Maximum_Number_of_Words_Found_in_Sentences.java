package com.company.Array.LeetcodeQuestion;

public class Maximum_Number_of_Words_Found_in_Sentences {
    public  static  void main(String [] args){


        String [] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }


    static int countStringWord(String str){
        int n =str.length();
        int count =0;

      String []arr =   str.split(" " );

      return  arr.length;
    }

    static int mostWordsFound(String[] sentences) {

        int n  =sentences.length;
        int max=0;
        for (int i=0;i<n;i++){
            if (max<countStringWord(sentences[i])){
                max = countStringWord(sentences[i]);
            }
        }
        return max;
    }


}
