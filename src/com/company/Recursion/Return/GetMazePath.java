package com.company.Recursion.Return;

import java.util.ArrayList;
import java.util.List;

public class GetMazePath {
    public static void main(String [] args){


        ArrayList<String> all= getPathList(1,1,2,3);
        System.out.println(all);


    }
    static ArrayList<String>  getPathList(int sr,int sc,int dr,int dc){

        if (sr == dr && sc==dc){
            ArrayList<String> list= new ArrayList<>();
            list.add("");
            return list;
        }

        ArrayList<String> hPath =new ArrayList<>();
        ArrayList<String>  vPath = new ArrayList<>();


        if (sc < dc){
            hPath = getPathList(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vPath = getPathList(sr+1,sc,dr,dc);
        }

        ArrayList<String> path = new ArrayList<>();


        for (String h: hPath){
            path.add("h"+h);
        }
        for (String v: vPath){
            path.add("v"+v);
        }


   return path;
    }
}
