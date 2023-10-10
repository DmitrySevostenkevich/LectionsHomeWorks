package org.example.zaurTregulov.lesson6;

public class Test1 {
    int sum(int x, int y, int z){
        return x + y + z;
    }
    int sredArifm(int x, int y, int z){
        return sum(x,y,z)/3;
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        int a =  test.sredArifm(10,3,4);
        int b = test.sum(3,4,6);
        System.out.println(a);
        System.out.println(b);
    }
}
