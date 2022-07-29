package com.company.String;

public class PatternSearching {
    public static void main(String [] args){

        NaivePatternApproach("ABABABCD","ABAB");
    }

    static void   NaivePatternApproach(String text ,String pattern){

        int n_text = text.length();
        int p_text = pattern.length();


        for (int  i= 0;i<=n_text-p_text;i++){

            int  j ;
            for (j =0;j<p_text;j++){
                if (pattern.charAt(j) != text.charAt(i+j)){
                    break;
                }

            }
            if (j==p_text){
                System.out.print (i + " ");
            }
        }



    }
}
