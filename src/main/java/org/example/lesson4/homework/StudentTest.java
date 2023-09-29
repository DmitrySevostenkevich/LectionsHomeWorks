package org.example.lesson4.homework;

public class StudentTest {
    public static void main(String[] args) {

        var student5 = new Student("Kozlov", "Stepan", 5, 4, 8.7, 3.2, 6.0);
        var student6 = new Student("Ivanov", "Ivan", 5, 4, 8.7, 2.4, 8.3);
        var student7 = new Student("Volodin", "Vladimir", 7, 6, 9.2, 6.8, 7.6);
        srednyaOcenka(student5);
        srednyaOcenka(student6);
        srednyaOcenka(student7);
    }

    public static void srednyaOcenka(Student student) {
        System.out.println((student.averageEconomic+ student.averageMathematic+ student.averageEnglish)/3);
    }
}
