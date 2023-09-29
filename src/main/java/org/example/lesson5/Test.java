package org.example.lesson5;

public class Test {
    int summ(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    class Test1 {
        public static void main(String[] args) {
            var s = new Test();
            int summaTrexChisel = s.summ(5, 8, 3);
            System.out.println(summaTrexChisel);
        }
    }

}
