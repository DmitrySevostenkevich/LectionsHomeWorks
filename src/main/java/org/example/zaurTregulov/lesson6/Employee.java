package org.example.zaurTregulov.lesson6;

public class Employee {
    Employee(int id2,String sureName2, int age2){
        this(id2,sureName2,age2,0.0,"null");
    }
    public Employee(String sureName3,int age3) {
        this(0,sureName3,age3,0.0,"null");
    }
    Employee(int id4,String sureName4,int age4,double salary4,String department4){
        id = id4;
        sureName = sureName4;
        age = age4;
        salary = salary4;
        department = department4;

    }
    int id;
    String sureName;
    int age;
    double salary;
    String department;

}
class EmloyeeTest{
    public static void main(String[] args) {
       Employee employee = new Employee(5,"Petrov",35,5000.0,"IT");
        System.out.println(employee.department);
    }
}
