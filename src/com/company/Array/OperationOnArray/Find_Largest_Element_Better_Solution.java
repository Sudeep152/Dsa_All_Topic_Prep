package com.company.Array.OperationOnArray;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.sql.Array;
import java.util.ArrayList;

public class Find_Largest_Element_Better_Solution {
public static void main(String [] args){

    int [] arr={70, 83, 82, 90 ,81};

    System.out.println("The Largest Index is "+findTheLargest(arr));



}

private static int findTheLargest(int []arr){

  int max =0;
  int index=0;

  for (int i=0;i<arr.length;i++){
      if (arr[i]>max){
          max=arr[i];
          index = i;
      }


  }
  return index;
}


}

