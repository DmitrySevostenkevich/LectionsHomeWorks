package org.example.zaurTregulov.lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
        System.out.println("Data type is int");
    }
    void show(int i1, int i2){
        System.out.println(i2);
    }
    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }
    void show(String s1, int i1){
        System.out.println(s1+i1);
    }    void show(int i2, String s1){
        System.out.println(s1+i2);
        System.out.println("Data type is String");
    }
}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.show("hi",555);
        methodOverloading.show(55,"Hello");
    }
}