package org.example.ZaurTregulov.lesson5;

public class PostOffice {
    public static void main(String[] args) {
        PostMessage message = new PostMessage("Moscoy","Hello Moscow!!!");
        PostBox box = new PostBox("Vashington",10.5,15.4,13.2,25);
        System.out.println(message.price);
        System.out.println(box.price);
    }
}
