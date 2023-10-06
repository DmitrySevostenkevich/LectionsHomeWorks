package org.example.ZaurTregulov.lesson5.library;

public class Book {
    String name;
    Author author;
    PublishingHouse publishingHouse;
    int yeaOfIssue;
    String genre;

    public Book(String name, Author author, PublishingHouse publishingHouse, int yeaOfIssue, String genre) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yeaOfIssue = yeaOfIssue;
        this.genre = genre;
    }
}