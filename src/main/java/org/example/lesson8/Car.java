package org.example.lesson8;

public class Car {
    String color = "blue";
    String engine = "v6";
}
class Human{
    String name = "Ivan";
    Car car = new Car();

    public static void main(String[] args) {
        Human human = new Human();
        human.car = new Car();
        human.car = new Car();
        human.car.engine = "v8";

    }
}