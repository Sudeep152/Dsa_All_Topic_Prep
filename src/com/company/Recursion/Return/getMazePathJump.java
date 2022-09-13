package com.company.Recursion.Return;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getMazePathJump {
public  static  void main(String [] args) {



    List<String> list = getAllJumpPath(1,1,4,3);
    System.out.println(list);


}

static List<String> getAllJumpPath(int sr,int sc, int dr,int dc){

    if (sr ==dr &&  sc == dc){
        List<String>list  = new ArrayList<>();
        list.add("");
        return list;
    }

    List<String>hrPaths= new ArrayList<>();
    List<String>vrPaths=new ArrayList<>();
    List<String>dnPaths= new ArrayList<>();

    List<String>allPaths = new ArrayList<>();

    //Horizontal Paths
    for (int i =1;i<=dc-sc;i++){
        hrPaths = getAllJumpPath(sr,sc+i,dr,dc);
        for (String hp : hrPaths){
            allPaths.add("h"+i+hp);
        }

    }

    //Vertical Paths
    for (int i=1;i<=dr-sr;i++){
        vrPaths = getAllJumpPath(sr+i,sc,dr,dc);
        for (String vr :vrPaths){
            allPaths.add("v"+i+vr);
        }
    }


    //Diagonal
    for (int i =1;i<=dc-sc && i<= dr-sc;i++){
        dnPaths= getAllJumpPath(sr+i,sc+i,dr,dc);
        for (String di : dnPaths){
            allPaths.add("d"+i+di);
        }

    }


return  allPaths;


}
}
