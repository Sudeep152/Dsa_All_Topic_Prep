package com.company.Recursion.Return;

public class PrintEncoding {


    public  static  void main(String [] args){

        EncodingPrint("226","");


    }


    static  void  EncodingPrint(String str,String  ans){
        if (str.length() ==0){
            System.out.println(ans);
            return;
        }
        else if (str.length() ==1){
            char ch = str.charAt(0);
            if (ch =='0'){
                return;
            }else {
                int chI = ch-'0';
                char code = (char) ('a' +chI-1);

                System.out.println(ans+code);
            }
        }else {
            char ch = str.charAt(0);
            String roq = str.substring(1);

            if (ch =='0'){
                return;
            }else {
                int chI = ch-'0';
                char code = (char) ('a' +chI-1);
                ans= ans+code;
                EncodingPrint(roq,ans);
            }

            String char12 = str.substring(0,2);
            String roq12 = str.substring(2);
            int size = Integer.parseInt(char12);
            if (size<=26){
                char code = (char) ('a'+size-1);
                EncodingPrint(roq12,ans+code);
            }

        }





    }

}
