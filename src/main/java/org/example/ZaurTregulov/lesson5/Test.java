package org.example.ZaurTregulov.lesson5;

public class Test {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    int sredneeArifm(int a,int b,int c){
        int result2 = summa(a,b,c)/3;
        return result2;
    }
}
     class Test1 {
        public static void main(String[] args) {
            Test s = new Test();
            int summaTrexChisel = s.summa(5, 8, 3);
            System.out.println(summaTrexChisel);
            System.out.println(s.summa(4,6,6));
            System.out.println(s.sredneeArifm(20,40,80));
        }
    }
