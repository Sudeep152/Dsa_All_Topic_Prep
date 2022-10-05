package com.company.Recursion.Return;

public class NQueen {
    public static void main(String [] args){

             int [ ] [] ar = new int[4][4];

             getPosition(ar,"",0);
    }


    static  void   getPosition(int [][] chess ,String ans ,int row){

        if (row== chess.length){
            System.out.println(ans);
            return;
        }


        for (int col= 0 ; col<chess.length;col++){
            chess[row][col] = 1;
            if (isItSafeCall(chess,row,col)){
                getPosition(chess,ans+row+"-"+col+",",row+1);
            }

            chess [row] [col]=0;

        }

    }


    static  boolean isItSafeCall(int [] [] chess ,int row,int col){

        for (int  i= row-1,j =col ;i>=0 ;i--){
          if (chess[i][j] ==1) {
              return false;
          }
        }
        for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (chess[i][j] ==1){
                return false;
            }
        }
        for (int i =row-1,j=col+1; i>=0&& j<chess.length;i--,j++){
            if (chess[i][j] ==1){
                return false;
            }
        }

        return true;

    }
}
