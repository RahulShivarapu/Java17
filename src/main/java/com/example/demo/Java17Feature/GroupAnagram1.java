package com.example.demo.Java17Feature;

import java.util.*;

public class GroupAnagram1 {

    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};

        Map<String , List<String>> map = new HashMap<>(); 

        for(String word : words){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            map.computeIfAbsent(key, k->new ArrayList<>()).add(word);
        }

        System.out.println(map);
    }

}
