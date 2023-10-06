package org.example.AndreySumin.Lesson1;

public class Lesson2 {
    //Находим гипотенузу треугольника при помощи теоремы Пифмгора
    public static void main(String[] args) {
        short a = 5;
        short b = 10;
        short c = (short) ((a * a) + (b * b));
        short r = (short) Math.sqrt(c);
        System.out.println(r);

    }
}
