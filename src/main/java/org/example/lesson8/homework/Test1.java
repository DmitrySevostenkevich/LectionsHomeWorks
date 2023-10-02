package org.example.lesson8.homework;
/*
В первом классе создайте 2 static метода.1-ый пусть умножает 3 числа из параметров метода и возвращает их поизведение
2-ой - делит первое число из параметра на второе и ничего не возвращет лишь выводит на дисплей в читабельном виде целое частное и остаток.
Во втором классе по два раза используйте данные методы.
 */
public class Test1 {
    int a;
    int b;
    int c;

    static int ymnojenie(int a1, int a2, int a3) {
        int a = a1;
        int b = a2;
        int c = a3;
        int result = a * b * c;
        return result;
    }

    static void delenie(int a3,int a4) {
        int a = a3;
        int b = a4;
        int d = a3 / a4;
        System.out.println("Proizvedenie a/b =" + d);
        int e = a3 % a4;
        System.out.println("Ostatok ot deleniya a/b =" + e);
    }
}
class Test_2{
    public static void main(String[] args) {
        System.out.println(Test1.ymnojenie(10,2,3));
        Test1 test1 = new Test1();
        test1.delenie();
    }
}


