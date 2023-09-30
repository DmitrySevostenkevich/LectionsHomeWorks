package org.example.lesson6.homework;


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

