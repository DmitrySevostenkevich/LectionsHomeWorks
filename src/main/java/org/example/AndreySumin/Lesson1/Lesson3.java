package org.example.AndreySumin.Lesson1;

public class Lesson3 {
    public static void main(String[] args) {
        int time = 22;
        boolean noch = time >=20;
        boolean goodWeather = true;
        if (noch){
            System.out.println("Спать");
        } if (noch && goodWeather){
            System.out.println("Гулять");
        }  if (noch && goodWeather){
            System.out.println("Читать книгу");
        }

    }
}
