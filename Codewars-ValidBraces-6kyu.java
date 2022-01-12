package com.company;

import java.util.Stack;

public class Main {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();

        for(char x : s.toCharArray()){
            if(x == '(' || x== '{' || x == '['){
                stack.push(x);
            }
            else if(x == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(x == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(x == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(})"));
    }
}
