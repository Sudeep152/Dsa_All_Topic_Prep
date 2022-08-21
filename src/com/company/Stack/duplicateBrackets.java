package com.company.Stack;

import java.util.Stack;

public class duplicateBrackets {
    public static void main(String [] args){

        String str = "((a+b)+(c+d))";
        System.out.println(checkDuplicate(str));


    }
    static boolean checkDuplicate(String str){

        Stack<Character> stack = new Stack<>();
        int n =str.length();
        boolean ans;


        for (int i=0;i<n;i++){

            char dum = str.charAt(i);

            if(dum == ')'){
                if(stack.peek() == '('){

                  return true;

                }else {
                    while (stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }else {
                stack.push(dum);
            }

        }


        return false;

    }


    public static boolean isBalanced(String expression) {
        //Your code goes here
        int n= expression.length();
        Stack<Character> stack = new Stack<>();


        expression= expression.replaceAll("\\s", "");
        for(int  i =0;i<n;i++){

            char temp = expression.charAt(i);




            if(temp==')' || temp=='}' || temp== ']'){

                if(stack.peek() == '(' ||stack.peek() == '{'  ||stack.peek() == '[' ){
                    return false;
                }else{

                    while(stack.peek() != '('  || stack.peek() != '{'  ||stack.peek() != '['){

                        stack.pop();
                    }
                    stack.pop();
                }

            }else{
                stack.push(temp);
            }





        }
        return false;

    }
}

