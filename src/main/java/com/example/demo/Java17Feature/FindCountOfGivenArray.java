package com.example.demo.Java17Feature;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindCountOfGivenArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,2,3,3,4,4,6,7,8,8};
        int target = 1;
        
        
        Map<Integer,Long>  map = Arrays.stream(arr).
        boxed()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        long count = Arrays.stream(arr).filter(n-> n == target)
        .count();
         
        System.out.println(map.get(target));
         System.out.println(count);

    }

}
