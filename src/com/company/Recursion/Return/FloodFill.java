package com.company.Recursion.Return;

public class FloodFill {
    public  static  void main(String [] args){

        int row=4 ;
        int col = 3;
        int [][] arr = {{0,1,1},{0,0,1},{1,0,0},{0,1,0}};

        boolean [][] visit = new boolean[row][col];
        allPath(arr,0,0,"",visit);

    }
    static  void  allPath( int [][] maze, int row ,int col,  String  ans,boolean [][] visited){

        if (row<0 || col<0 || row ==maze.length || col ==maze[0].length || maze[row][col]==1||visited  [row][col] ==true){
           return;
        }
        if (row==maze.length-1 && col==maze[0].length-1){
            System.out.println(ans);
            return;
        }


        visited[row][col]=true;
        allPath(maze,row-1,col,ans+"T",visited);
        allPath(maze,row,col-1,ans+"L",visited);
        allPath(maze,row+1,col,ans+"D",visited);
        allPath(maze,row,col+1,ans+"R",visited);
        visited[row][col]=false;







    }
}
