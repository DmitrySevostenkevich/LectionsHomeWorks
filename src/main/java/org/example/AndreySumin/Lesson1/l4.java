package org.example.AndreySumin.Lesson1;
public class l4 {
    public static void main(String[] args) {
        int XYZ = 10_000_000;
        for (int a = 0; a < 10; a++) {
            int rozd = XYZ / 1000 * 14;
            int smertnost = XYZ / 1000 * 8;
            XYZ += (rozd - smertnost);
            System.out.println(XYZ);
        }
    }
}