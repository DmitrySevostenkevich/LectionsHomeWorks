package org.example.ZaurTregulov.lesson5;

public class Employee {
    int id;
    String sureName;
    int age;
    double salary;
    String department;

    public Employee(int id, String sureName, int age, double salary, String department) {
        this.id = id;
        this.sureName = sureName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    public void doubleSalary(){
        salary *=2;
    }
}
