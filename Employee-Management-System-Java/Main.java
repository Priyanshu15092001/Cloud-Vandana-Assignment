package com.ems;
import java.util.*;
class Main{
    public static void main(String[]args){
        
        ArrayList<Employee>list =new ArrayList<>();

        list.add(new Employee(1,"Soham",100000.00));
        list.add(new Employee(2,"Sourav",200000.00));
        list.add(new Employee(3,"Sudipto",1000000.00));
        list.add(new Employee(4,"Anjali", 450000.34));
        
        System.out.println("id\tname\tsalary");

        for(Employee obj:list){
            obj.displayDetails();
        }

    }
}