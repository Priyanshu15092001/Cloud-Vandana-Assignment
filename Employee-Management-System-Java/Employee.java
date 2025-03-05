package com.ems;
class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void displayDetails()
    {
        System.out.println(id+"\t"+name+"\t"+salary);
    }
}