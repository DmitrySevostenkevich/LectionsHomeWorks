package org.example.zaurTregulov.lesson6.homework;
/*
Создать класс в котором будут 5 ovrerloaded методов,которые вычисляют сумму нуля,одного,двух,трех и четырех целых чисел.
Передают эту сумму в output и выводят на экран.
Когда слагаемые отсутствуют (параметров нет) сумма пусть равняется 0
 */
public class Test {
    int SummaChisel(){
        return 0;
    }
    int SummaChisel(int a) {
        return a + a;
    }
    int SummaChisel(int a, int b){
        return a + b;
    }
    int SummaChisel(int a, int b, int c){
        return a + b + c;
    }
    int SummaChisel(int a, int b, int c,int d){
        return a + b + c + d;
    }
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.SummaChisel());
        System.out.println(test.SummaChisel(5));
        System.out.println(test.SummaChisel(6,30));
        System.out.println(test.SummaChisel(7,8,3));
        System.out.println(test.SummaChisel(3,5,4,8));
    }
}
