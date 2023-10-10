package org.example.zaurTregulov.lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(5,"Ivanov",55,5045.5,"finance");
        Employee employee1 = new Employee(4,"Petrov",25,1500.5,"commercial");
        employee.doubleSalary();
        employee1.doubleSalary();
        System.out.println(employee.salary);
        System.out.println(employee1.salary);
    }
}
