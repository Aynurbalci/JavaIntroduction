package ExamExercises1;

import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;

    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
    }

    public void add(double amount) {
        this.balance += amount;
    }

    int cnt = -1;

    public void withdraw(double amount) {
        String password = "1234";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the 4-digit pass: %n ");
        if (password.equals(scanner.next()) && cnt++ <= 3) {
            System.out.printf("You can withdraw the money %n");
            System.out.printf("How much do you want to withdraw the money %n");
            setBalance(scanner.nextInt());

        } else if (cnt < 3) {
            System.out.printf("Try again %n");
        } else {
            System.out.printf("your account has been blocked,please try again later %n");
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if (amount > balance) {
            System.out.printf("Insufficient Money %n");
        } else {
            this.balance -= amount;
        }

    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
