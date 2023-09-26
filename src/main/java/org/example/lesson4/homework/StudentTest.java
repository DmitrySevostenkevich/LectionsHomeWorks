package org.example.lesson4.homework;

public class StudentTest {
    public static void main(String[] args) {

        var student4 = new Student("Kozlov","Stepan",5,4,8.7);
        var student5 = new Student("Ivanov","Ivan",5,4,8.7);


        student4.lern();
        student5.lern();
        student5 = student4;
        student5.lern();
        student5.sureName = "Aleks";
        student4.lern();
        student5.lern();
        System.out.println();
    }
}
