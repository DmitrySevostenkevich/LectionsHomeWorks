package org.example.andreySumin.Lesson1;

//В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
// Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год
// Рассчитайте, какая численность населения будет через 10 лет, учитывая, что рождаемость не может быть меньше 7 человек на 1000 человек,
// а смертностность не может быть меньше 6 человек на 1000 человек.


public class Naselenie {
    public static void main(String[] args) {
        int XYZ = 10_000_000;
        int rozd = 14;
        int smertnost = 8;
        for (int a = 0; a < 10; a++) {
            XYZ += (XYZ/1000 * rozd - XYZ/1000 * smertnost);
            if (rozd > 7){
                rozd-=1;
            }
            if (smertnost > 6){
                smertnost-=1;
            }
            System.out.println(XYZ);
        }
    }
}
