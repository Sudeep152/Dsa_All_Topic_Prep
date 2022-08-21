package com.company.LinkedList;

public class MergeSortedLinkedList {
    public  static  void main(String [] args){

        Creating_LinkedList.MyLinkedList list1= new Creating_LinkedList.MyLinkedList();
        Creating_LinkedList.MyLinkedList list2= new Creating_LinkedList.MyLinkedList();
        list1.addLast(11);
        list1.addLast(2);
        list1.addLast(13);
        list1.addLast(4);
        list1.addLast(15);




        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(8);
        list2.addLast(10);
        list2.addLast(17);

        list1.displayList();
        list2.displayList();


      MergeList(list1,list2).displayList();


    }
    static Creating_LinkedList.MyLinkedList MergeList(Creating_LinkedList.MyLinkedList list1, Creating_LinkedList.MyLinkedList list2){

        Creating_LinkedList.Node first = list1.head;
        Creating_LinkedList.Node second = list2.head;

        Creating_LinkedList.MyLinkedList res = new Creating_LinkedList.MyLinkedList();


        while(first!=null && second!=null){

            if(first.val ==second.val){
                res.addLast(first.val);
                res.addLast(second.val);
                first= first.next;
                second=second.next;
            }else if(first.val <  second.val){
                res.addLast(first.val);
                first=first.next;
            }else{
                res.addLast(second.val);
                second=second.next;
            }


        }

        while (first!=null){

            res.addLast(first.val);
            first= first.next;
        }

        while (second !=null){
            res.addLast(second.val);
            second=second.next;
        }

        return res;


    }

}
