package org.example.zaurTregulov.lesson5;

public class PostBox {
    String adres;
    double height;
    double width;
    double length;
    double weight;
    double price;

    public PostBox(String adres, double height, double width, double length, double weight) {
        this.adres = adres;
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.price = 10.5*weight;
    }
}
