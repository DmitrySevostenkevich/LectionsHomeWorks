package org.example.zaurTregulov.lesson6.homework;
/*
Измените класс Student что бы он имел 3 конструктора .
1 принимает все параметры.
2-ой: id, name,sureName,course
3-ий: не принимает значений
Создайте в классе StudentTest 3 обьекта с помощью разных конструкторов.

 */
public class Student {
    String sureName;
    String name;
    int numberTicket;
    int course;
    double averageEconomic;
    double averageMathematic;
    double averageEnglish;

    public Student() {
    }

    public Student(String sureName, String name, int numberTicket, int course) {
        this.sureName = sureName;
        this.name = name;
        this.numberTicket = numberTicket;
        this.course = course;
    }

    public Student(String sureName, String name, int numberTicket, int course, double averageEconomic, double averageMathematic, double averageEnglish) {
        this.sureName = sureName;
        this.name = name;
        this.numberTicket = numberTicket;
        this.course = course;
        this.averageEconomic = averageEconomic;
        this.averageMathematic = averageMathematic;
        this.averageEnglish = averageEnglish;
    }
}

