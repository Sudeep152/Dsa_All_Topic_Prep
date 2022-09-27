package com.company.Recursion.Return;

public class PrintMazePath {
    public static void main(String [] args){

        printMazePath(1,1,3,3,"");


    }
    static void  printMazePath(int srcR,int srcC,int desR,int desC,String path){

        if (srcC==desC && srcR==desR){
            System.out.println(path);
            return;
        }


        if(srcC< desC){
            printMazePath(srcR,srcC+1,desR,desC,path+"h");
        }
        if (srcR<desR){
            printMazePath(srcR+1,srcC,desR,desC,path+"v");
        }




    }

}
