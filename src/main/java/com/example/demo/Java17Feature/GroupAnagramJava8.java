package com.example.demo.Java17Feature;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagramJava8 {
    public static void main(String[] args) {
        
    
    String[] words = {"eat","tea","tan","ate","nat","bat"};

    Map<String , List<String>> map = Arrays.stream(words)
    .collect(Collectors.groupingBy(word->{
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }));
    System.out.println(map.values());

    }
}
