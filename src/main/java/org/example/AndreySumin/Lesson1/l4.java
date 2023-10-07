package org.example.AndreySumin.Lesson1;
public class l4 {
    public static void main(String[] args) {

        int XYZ = 10_000_000;
        int rozd = XYZ / 1000 * 14;
        int smertnost = XYZ / 1000 * 8;
        for (int i = 0; i < 10; i++) {
        XYZ = (XYZ+rozd)-smertnost;
            System.out.println(XYZ);
        }
    }
}