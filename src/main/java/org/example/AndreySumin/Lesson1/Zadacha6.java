package org.example.AndreySumin.Lesson1;

import java.util.Scanner;

//В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
//
//После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
//И если пользователь введет число 1, то программа завершает цикл. Если введено любое другое число,
//то программа продолжает спрашивать у пользователя два числа и умножать их.
public class Zadacha6 {
    public static void main(String[] args) {
        do {
            System.out.println(ymnojenie());
        }
        while (!vyhod());
    }
        public static int ymnojenie(){
            System.out.println("Введите 2 числа:");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            return a*b;
        }
        public static boolean vyhod(){
            System.out.println("Если хотите выйти-введите 1");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            return a == 1;
        }
}
