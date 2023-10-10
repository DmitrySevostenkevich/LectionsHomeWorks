package org.example.andreySumin.Lesson1;
//За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу, в которую пользователь
//вводит сумму вклада и количество месяцев.
//А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//
//Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
//
//Пример работы программы:
//Введите сумму вклада: 100
//Введите срок вклада в месяцах: 1
//После 1 месяцев сумма вклада составит 107,000000

import java.util.Scanner;//импортируем класс сканер
public class Zadacha3 {// обявляем публичный класс Zadacha3
    public static void main(String[] args) {// создаем метод main
        Scanner scanner = new Scanner(System.in);//создаем новый обьект класса Сканер
        System.out.println("Введите сумму вклада");//выводим на экран Введите сумму вклада
        float amount = scanner.nextFloat();// ждем ввода от пользователя
        System.out.println("Введите срок вклада");//выводим на экран Введите срок вклада
        int monthCount = scanner.nextInt();//ждем ввода от пользователя
        System.out.println("Введите сумму ежемесячного пополнения");//выводим на экран Введите срок вклада
        float summPopolneniya = scanner.nextFloat();
        for (int c = 0;c<monthCount;c++){// создаем цикл
            amount = amount + summPopolneniya + (amount / 100 * 15 / 12);//
            System.out.println(amount);//
        }
        }
}

