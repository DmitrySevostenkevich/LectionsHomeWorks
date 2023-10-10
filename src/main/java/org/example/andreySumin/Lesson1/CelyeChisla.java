package org.example.andreySumin.Lesson1;

import java.util.Scanner;

public class CelyeChisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-ю сторону");
        double a = scanner.nextDouble();
        System.out.println("Введите 2-ю сторону");
        double b = scanner.nextDouble();
        System.out.println("Введите 3-ю сторону");
        double c = scanner.nextDouble();
        if (sGeron(a, b, c) > 0) {
            System.out.println("Площадь треугольника: " + sGeron(a, b, c));
        } else {
            System.out.println("Такого треугольника не существует");
        }
        if (isqadro(a, b, c)) {
            System.out.println("Треугольник прямоугольный");
        }

    }

    private static boolean isqadro(double a, double b, double c) {
        if (a > b && a > c && a * a == b * b + c * c) {
            return true;
        }
        if (b > a && b > c && b * b == a * a + c * c) {
            return true;
        }
        return c > a && c > b && c * c == a * a + b * b;
    }

    public static double sGeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
