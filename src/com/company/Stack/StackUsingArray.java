package com.company.Stack;
public class StackUsingArray {

    private int [] data ;
  private int top;

    public StackUsingArray() {
        data = new int[10];
        top=-1;
    }

    public  StackUsingArray(int stackCapacity){
        data = new int[stackCapacity];
        top=-1;
    }

    public boolean isEmpty(){
        return (top==-1);
    }
    public int size(){
        if(top==-1){
            return -1;
        }else {
            return top+1;
        }
    }

    public int top() {
        if(top ==-1){
            return -1;
        }else {
            return data[top];
        }
    }

    public  void push(int ele){

        if(data.length == size()
        ){
            doubleCapacity();
        }else {
            top++;
            data[top]=ele;
        }

    }
    public int pop(){
        int temp = data[top];
        top --;
        return temp;
    }

    public void display(){
        if(top == -1 ){
            System.out.println("list empty");
        }else {
            for (int i=0;i<=top;i++){
                System.out.print(data[i]+ " ");
            }
        }


    }
    private void  doubleCapacity(){
        int [] temp =data;
        data = new int[2*temp.length];
        for (int i=0;i<=top ;i++){
            data[i] = temp[i];
        }


    }

}
