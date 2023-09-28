package org.example.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        int ch1 = 5;
        int a2 = 6;
        int a3 = 8;
        var s1 = summ(ch1, a2);
        System.out.println(summ(s1, a3));
    }

    public static float summ(float a, float b) {
        return a + b;
    }
}