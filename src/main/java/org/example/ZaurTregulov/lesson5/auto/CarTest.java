package org.example.ZaurTregulov.lesson5.auto;

public class CarTest {
    public static void main(String[] args) {
        Drive drive = new Drive("Audi",12,24,4);
        Korobka korobka = new Korobka(true);
        Brake brake = new Brake(true);
        Kuzov kuzov = new Kuzov("Sedan","Black");
        Car car = new Car(drive,korobka,brake,kuzov);
        System.out.println();
    }
}
