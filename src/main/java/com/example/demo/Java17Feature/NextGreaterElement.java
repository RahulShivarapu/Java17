package com.example.demo.Java17Feature;

import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args){

        int[] arr = {4,5,2,25};
        int n = arr.length;

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for(int i=n-1;i>=0;i--){
            while(!stack.empty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                result[i] =-1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        for(int i=0; i<n ;i++){
            System.out.println( arr[i]+"->" + result[i]);
        }



     }

}
