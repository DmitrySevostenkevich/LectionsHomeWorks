package org.example.lesson6;

public class MethodOverloading2 {
    public int sum(int i1, int i2){
        return i2 - i1;
    }
    protected String sum(String s1,String s2){
        return s1 + s2;
    }
}
    class MethodOverloading2Test{
        public static void main(String[] args) {
            MethodOverloading2 methodOverloading2 = new MethodOverloading2();
            int a = methodOverloading2.sum(5,10);
            System.out.println(a);
            String s = methodOverloading2.sum("Hello ","World");
            System.out.println(s);
        }
    }
