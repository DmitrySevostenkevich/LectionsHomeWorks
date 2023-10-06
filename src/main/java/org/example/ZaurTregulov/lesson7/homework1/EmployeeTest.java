package org.example.ZaurTregulov.lesson7.homework1;

import org.example.ZaurTregulov.lesson7.homework.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(657,"Sidorov",1);
        System.out.println(employee.sureName);
        employee.getId();
        employee.salary();
        employee.sureName();
        }
    }
