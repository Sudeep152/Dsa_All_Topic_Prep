package com.company.LinkedList;

public class StackAdapter  {
    public static class LLtoStack{

        Creating_LinkedList.MyLinkedList list ;
        public LLtoStack(){
       list = new Creating_LinkedList.MyLinkedList();
        }

        int Size(){
            return list.size;
        }

        void push(int val){
            list.addLast(val);
            list.displayList();
        }

        void pop(){
            list.deleteFirstElement();
            list.displayList();
        }


        int   top(){
            return list.getFirstEle();
        }


    }

    public static void main(String [] args){
        LLtoStack s = new LLtoStack();

        s.push(2);
        s.push(1);
        s.push(3);

        s.pop();

    }


}
