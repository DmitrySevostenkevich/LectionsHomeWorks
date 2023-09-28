package org.example.lesson4.homework;

import java.sql.SQLOutput;

public class Student {
    String sureName;
    String name;
    int numberTicket;
    int course;
    Double averageEconomic = 0.0;
    Double averageMathematic = 0.0;
    Double averageEnglish = 0.0;

    public Student(String sureName, String name, int numberTicket, int course, double averageEconomic, double averageMathematic,double averageEnglish) {
        this.sureName = sureName;
        this.name = name;
        this.numberTicket = numberTicket;
        this.course = course;
        this.averageEconomic = averageEconomic;
        this.averageMathematic = averageMathematic;
        this.averageEnglish = averageEnglish;
    }

    public Student(String sureName, String name, int numberTicket, int course) {
        this.sureName = sureName;
        this.name = name;
        this.numberTicket = numberTicket;
        this.course = course;
    }

    public void lern(){
        System.out.println("Студент " + this.sureName + " средняя арифметическая оценка " + (this.averageMathematic+this.averageEnglish+this.averageEconomic)/3 );
    }

}

