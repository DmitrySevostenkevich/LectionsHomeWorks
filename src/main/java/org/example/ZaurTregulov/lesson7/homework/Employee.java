package org.example.ZaurTregulov.lesson7.homework;

/*
 Пересоздайте класс  Employee таким образом что бы переменная salary была недоступна вне класса
 переменная sureName была  доступна отовсюду
 а переменная id только внутри пакета.
 Так же создайте 3 public метода которые будут показывать на дисплее значения этих переменных.
 Создайте для данного класса 3 разных конструктора с public,default private acces modifier-ами
 В конструкторах присваивайте переменным класа значения из параметров
 Создайте новые классы в том же и другом пакете
 Попытайтесь в них создать обьекты класса Employee и вывести на экран значения переменных данного обьекта с помощью метода println и методов самого класса.
 */
public class Employee {
    private double salary;
    public String sureName;
    int id;

    public void salary() {
        System.out.println("Зарплата = " + salary);
    }

    public void sureName() {
        System.out.println("Фамилия - " + sureName);
    }

    public void getId() {
        System.out.println("Номер клиента - " + id);
    }

    public Employee(double salary, String sureName, int id) {
        this.salary = salary;
        this.sureName = sureName;
        this.id = id;
    }
}


