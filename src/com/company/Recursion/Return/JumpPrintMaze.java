package com.company.Recursion.Return;

public class JumpPrintMaze {
    public static void main(String [] args){


        jumpPrintMaze(1,1,3,3,"");

    }
    static  void  jumpPrintMaze(int srR,int srC,int dR ,int dC,String path){


        if (srC ==dC && srR==dR){
            System.out.println(path);
            return;
        }

        for (int i =1;i<=dR-srR;i++){
            jumpPrintMaze(srR+i,srC,dR,dC,path+"v"+i);
        }

        for (int i =1;i<=dC-srC;i++){
            jumpPrintMaze(srR,srC+i,dR,dC,path+"h"+i);
        }



        for (int i =1;i<=dR-srR && i<=dC-srC;i++){
            jumpPrintMaze(srR+i,srC+i,dR,dC,path+"d"+i);
        }



    }
}
