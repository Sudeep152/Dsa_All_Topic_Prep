package com.company.LinkedList;

public class KthFromEndInLinkedList {
    public  static void main( String [] args){

        Creating_LinkedList.MyLinkedList myLinkedList = new Creating_LinkedList.MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);

        myLinkedList.displayList();



        System.out.println(kthElement(myLinkedList,7));
    }
    static int kthElement(Creating_LinkedList.MyLinkedList myLinkedList, int k){

        int size = myLinkedList.size;
        int small =0;
        int high =0;
if (myLinkedList.size <k){
    return -1;
}

        for(int i=0;i<k;i++){
            high++;
        }

        while (high!=myLinkedList.size){
            high++;
            small++;
        }
        return small;
    }
}
