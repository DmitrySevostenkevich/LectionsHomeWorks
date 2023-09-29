package org.example.lesson5;

public class BankAccount {
    int id = 5;
    String name = "Ivan";
    double balance = 5000;

    void popolnenieScheta(double summaPopolneniya) {
        System.out.println("Баланс счета " + name + " = " + balance);
        balance += summaPopolneniya;
        System.out.println("Баланс счета после пополнения " + balance);
    }

    void snyatieSoScheta(double summaSnytia) {
        balance -= summaSnytia;
        System.out.println("Баланс счета после снятия " + balance);
    }

    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.popolnenieScheta(5456.44);
        bA.snyatieSoScheta(1555.44);
    }
}
