package com.example.demo.Java17Feature;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetEmployee {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
        new Employee("Rahul","software", 10000),
        new Employee("John","IT", 150000),
        new Employee("Ram","software", 90000),
        new Employee("Ramesh","IT", 10000)
        );


       Map<String , Optional<Employee>> map =  list.stream().
       collect(Collectors.groupingBy(Employee::getDepartment
       ,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

       map.forEach((dep,emp)->System.out.println("department : " + emp.get().getDepartment()+" | Highest salary:  " + emp.get().getSalary() + " | Employee : " + emp.get().getName()));


    }

   

    

}
