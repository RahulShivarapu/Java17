package com.example.demo.Java17Feature;

import java.util.Stack;

public class BalanceParenthesis {

    public static void main(String[] args) {

        String str = "{[()]}";
        System.out.println(new BalanceParenthesis().isBalanced(str));
    }

    Boolean isBalanced(String str){

       Stack<Character> stack = new Stack<>();
        for(Character ch : str.toCharArray()){
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }else if(ch=='}' || ch==']' || ch==')'){
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if((ch == ')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

}
