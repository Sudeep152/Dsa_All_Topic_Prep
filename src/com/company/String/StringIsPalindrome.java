package com.company.String;

public class StringIsPalindrome {
    public  static void main(String  [ ] args){

        String str = "geeek";
        System.out.println(NaiveApproach(str));
        System.out.println(EfficientApp(str));
    }
    static boolean NaiveApproach(String str){

       StringBuilder res = new StringBuilder(str);

       res.reverse();

       return  str.contentEquals(res);
       ///O(N)
        //O(N)

    }

    static boolean EfficientApp(String str){

        int n = str.length();
        int start = 0;
        int end = n-1;
            while (start<end){

                if (str.charAt(start) != str.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }


        return true;
        }

    }

