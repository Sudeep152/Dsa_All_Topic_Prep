package com.company.LinkedList;

import com.sun.security.auth.NTDomainPrincipal;

public class Creating_LinkedList {

    public static class Node{
        int val ;
        Node next;
    }
    public  static class  MyLinkedList{

      protected     Node head;
       protected    Node tail;
         int  size;

        public void addLast(int val){
             Node tempNode = new Node();

         if(size==0){
                 tempNode.next= null;
                 tempNode.val = val;
                 head= tempNode;
                 tail=tempNode;
                 size++;
             }else {
                 tempNode.val = val;
                 tempNode.next=null;
                 tail.next= tempNode;
                 tail= tempNode;
                 size++;

             }


         }
         public  int listSize(){
             return size;
         }
         public void displayList(){

             Node tempNode = head;

             while (tempNode !=null){

                 System.out.print(tempNode.val + " ");
                 tempNode = tempNode.next;

             }

             System.out.println();

         }
         public void deleteFirstElement(){


            if (size ==0){
                System.out.println("List is empty please add some elements");
            }else if (size ==1){
               head = null;
               tail= null;
               size=0;
            }else {
                head= head.next;
                size--;
            }


        }
       public  int getFirstEle(){
            if(size ==0){
                return -1;
            }
            return  head.val;
       }
       public  int getLastEle(){
            if(size ==0){
                return -1;
            }return tail.val;
       }
       public  void getAtEle(int index){
            if(index > size-1 && index <= 0 ){
                System.out.println("Invalid Argument");
            }else if(size == 0){
                System.out.println("Empty List");
            } else {

                for (int i =0;i<index;i++){
                    head = head.next;
                }
                System.out.println("index " + index+ " -> "+ head.val);

            }

       }


       public void setFirstELe(int val){
            Node temp = new Node();
            temp.val = val;
            temp.next=head;
            head= temp;
            if (size ==0){
                tail= temp;
            }
            size++;

       }
       public void addAtIndex(int val,int pos){

        if (pos <=0 || pos >size){
            System.out.println("Invalid Position");
        }else if( pos == size){
            addLast(val);
        }else if (pos==1){
            setFirstELe(val);
        }else {

            Node newNode = new Node();
            Node temp = head;
            newNode.val = val;
            for (int i=1 ;i<pos-1;i++){
                temp = temp.next;
            }
            newNode.next =temp.next;
            temp.next = newNode;
            size++;
        }



       }
       public void removeLast(){

            if (size ==0){
                System.out.println("List is Empty");
            }else if(size ==1){
                head= null;
                tail = null;
                System.out.println("Null");
            }else {

                Node temp = head;
                for (int i =0;i<size-2
                        ;i++){
                    temp = temp.next;
                }
                temp.next=null;
                tail=temp;
             size--;
            }

       }
       private  Node getAtNode(int index){
            Node node = head;
            Node temp = new Node();
            for (int  i=0; i<index;i++){
                node= node.next;
            }
            temp = node;
            return temp;
       }
       public  void  reverseLinkedList(){
            int li =0;
            int ri = size-1;

            while (li < ri){

                Node left = getAtNode(li);
                Node right = getAtNode(ri);
                int temp =left.val;
                left.val = right.val;
                right.val= temp;
                li++;
                ri--;
            }
            displayList();

       }
       public  void  reverseIP(){

            Node prev = null;
            Node curr = head;

         while (curr!=null){
                Node newCurr = curr.next;
                curr.next= prev;
                prev =curr;
                curr=newCurr;
            }

         Node temp =head;
            head = tail;
            tail= temp;

            displayList();


       }
       public  void  removeAt(int Index){
            Node temp = head;

            if(Index < 0  ){
                System.out.println("List is empty");
            }else if (Index ==0){
                removeLast();
            }else {
                for (int i =0;i<Index-1;i++){
                    temp= temp.next;
                }

                temp.next=temp.next.next;

            }
            displayList();


       }

       public int mid() {

            Node slow = head;
            Node fast =head;

            while (fast.next !=null && fast.next.next!=null) {

                slow=slow.next;
                fast=fast.next.next;

            }
            return slow.val;

       }






    }
    public  static  void  main(String [] args){

        MyLinkedList list = new MyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.displayList();
//
//        list.displayList();
//       System.out.print("List First Elements -> " +  list.getFirstEle() + "\n");
//       System.out.println("List Second Elements -> " +list.getLastEle());
//       list.getAtEle(5);
//          list.setFirstELe(12);
//          list.displayList();
//          list.addAtIndex(22,0);
//          list.displayList();
//          list.removeLast();
//          list.displayList();
//          list.reverseLinkedList();
//          list.reverseIP();
//          list.removeAt(2);


        System.out.println(list.mid());


    }



}
