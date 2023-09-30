package org.example.lesson6.homework;

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
