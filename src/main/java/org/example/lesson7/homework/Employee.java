package org.example.lesson7.homework;
/*
 Пересоздайте класс  Employee таким образом что бы переменная salary была недоступна вне класса
 переменная sureName была  доступна отовсюду
 а переменная id только внутри пакета.
 Так же создайте 3 public метода которые будут показывать на дисплее значения этих переменных.
 Создайте для данного класа 3 разных конструктора с public,default private acces modifier-ами
 В конструкторах присваивайте переменным класа значения из параметров
 Создайте новые классы в том же и другом пакете
 Попытайтесь в них создать обьекты класса Employee и вывести на экран значения переменных данного обьекта с помощью метода println и методов самого классаю
 */
public class Employee {
    private double salary = 5000.7;
    public String sureName = "Ivanov";
    int id = 5;
    public void salary(double salary){
        System.out.println(salary);
    }
    public static void main(String[] args) {

    }
}


