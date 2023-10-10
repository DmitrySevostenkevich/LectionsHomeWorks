package org.example.zaurTregulov.lesson5.library;

public class Library {
    public static void main(String[] args) {
        Author author = new Author("Ivanov","Petr","Ivanovich");
        PublishingHouse publishingHouse = new PublishingHouse("BYK","Minsk");
        Book book = new Book("Java для чайников",author,publishingHouse,2022,"scientific");
        System.out.println();
    }
}
