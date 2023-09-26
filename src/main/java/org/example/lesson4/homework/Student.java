package org.example.lesson4.homework;

public class Student {
    String sureName;
    String name;
    int numberTicket;
    int course;
    double averageEconomic;

    public Student(String sureName, String name, int numberTicket, int course, double averageEconomic) {
        this.sureName = sureName;
        this.name = name;
        this.numberTicket = numberTicket;
        this.course = course;
        this.averageEconomic = averageEconomic;
    }

    public Student() {
    }

    public void lern() {
        System.out.println("Студент " + this.sureName + " активно учится!!!");
    }
}

