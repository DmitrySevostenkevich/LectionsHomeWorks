package org.example.andreySumin.Lesson1;

public class ciclFor {
    public static void main(String[] args) {
        int summ = 1000;
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                continue;
            }
            if (summ - i > 0) {
                summ -= i;
            }else{
             break;}
            System.out.println(summ + " итерация " + i);
        }
    }
}
