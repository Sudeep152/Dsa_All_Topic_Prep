package com.company.String;

public class LeftMostRepeatingCharacter {
    public  static  void main(String [] args){

        String str ="cbab";
        System.out.println(NaiveSolution(str));
      System .out.println(EfficientSolution(str));
      System .out.println(EfficientSolutionOneTrever(str));

    }
    static  int NaiveSolution(String str ){

        int n = str.length();

        for (int i =0;i<n;i++){

            for (int j =i+1;j<n;j++){

                if (str.charAt( i) == str.charAt(j) ){
                    return i;
                }
            }


        }
        return -1;
    }

    static int EfficientSolution(String str){

        int n = str.length();
        int  [] count = new int[256];

        for (int i =0;i<str.length();i++){

            count[str.charAt(i)]++;
        }

        for (int i =0;i<str.length();i++){
            if (count[str.charAt(i)] >1){
                return i;
            }
        }

        return -1;


    }

    static int EfficientSolutionOneTrever(String str){
        int  n = str.length();
        boolean  [] visited= new boolean[256];
        int res =0;
        for (int i=n-1 ;i>=0;i--){
            if (visited[str.charAt(i)]){
                res = i;
            }else {
                visited[str.charAt(i)]=true;
            }

        }


     return res;
    }

}
