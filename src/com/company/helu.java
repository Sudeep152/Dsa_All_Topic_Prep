//package com.company;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class helu {
//    public static void main(String [] args) {
//
//
//        List<String> list= getAllPermutation("321");
//        System.out.println(list);
//
//    }
//
//    public static List<String> getAllPermutation(String str){
//
//
//
//        if (str.length()==0){
//            ArrayList<String> list= new ArrayList<>();
//            list.add("");
//            return list;
//        }
//
//
//        for(int i=0;i<str.length();i++){
//            char f = str.charAt(i);
//
//            String leftPart = str.substring(0,i);
//            String rightPart=str.substring(i+1);
//            String merge= leftPart+rightPart;
//            getAllPermutation(merge);
//
//        }
//
//
//    }
//
//}
