package SchoolExercises.exercise1;

import java.util.Scanner;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void setBalance(double amount) {
        String sifre = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Lutfen sifrenizi giriniz");

        if (sifre.equals(scanner.next())) {
            if (amount < this.balance) {
                this.balance -= amount;

            }
            else{
                System.out.println("yetersiz bakiye");
            }

        }

    }

    public double getBalance() {

        String sifre = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.println("paranızı ogrenmek icin sifre giriniz");
        if (sifre.equals(scanner.next())) {

            return balance;


        }
        else {
            return  0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
