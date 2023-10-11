package org.example.andreySumin.Lesson1;

import java.util.Scanner; // импортируем сканер

public class CelyeChisla {//создаем класс
    public static void main(String[] args) {//создаем метод мэйн
        Scanner scanner = new Scanner(System.in);//создаем обьект типа сканер
        System.out.println("Введите 1-ю сторону");//выводим на консоль строку
        double a = scanner.nextDouble();//переменной а типа double присваиваем значение считанное из ввода
        System.out.println("Введите 2-ю сторону");//выводим на консоль строку
        double b = scanner.nextDouble();//переменной b типа double присваиваем значение считанное из ввода
        System.out.println("Введите 3-ю сторону");//выводим на консоль строку
        double c = scanner.nextDouble();//переменной c типа double присваиваем значение считанное из ввода
        if (sGeron(a, b, c) > 0) {//создаем цикл if котрый принимает метод sGeron и если введенные числа больше 0 выполняет тело цикла
            System.out.println("Площадь треугольника: " + sGeron(a, b, c));//выводим на консоль площаль треугольника
        } else {//если условие в цикле False выполняется цикл "иначе"
            System.out.println("Такого треугольника не существует");//выводим на консоль строку
        }
        if (isqadro(a, b, c)) {// создаем цикл if котрый принимает метод isqadro
            System.out.println("Треугольник прямоугольный");//выводим на консоль строку
        }

    }

    private static boolean isqadro(double a, double b, double c) {//создаем метод приватный статический который принимает параметры типа даубл
        if (a > b && a > c && a * a == b * b + c * c) {//создаем цикл который проверяет условие
            return true;//и возвращает булевое значение тру
        }
        if (b > a && b > c && b * b == a * a + c * c) {//создаем цикл который проверяет условие
            return true;//и возвращает булевое значение тру
        }
        return c > a && c > b && c * c == a * a + b * b;//тут так же возвращает тру.Либо False и тогда метод не выполняется
    }

    public static double sGeron(double a, double b, double c) {//создаем метод публичный статический sGeron который принимает параметры типа даубл
        double p = (a + b + c) / 2;//создаем переменную р типа даубл и присваиваем ей значение-результат вычисления
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));//метод возвращает квадратный корень треугольника .Используя формулу Герона
    }
}
