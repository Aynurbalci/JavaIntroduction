package School.Lab2;

import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
/*
    public Account(String Name,
                   Double balance) {


    }*/

    public int Password = 1234;
    private double balance = 500;
    private String ownerName;


    public void Add(double amount) {


    }


    public void Withdraw(double amount) {
        int s = 0;
        System.out.println("Please enter your Password");
        Password = input.nextInt();

        try {
            if (Password == 1234) {
                System.out.println("you can withdraw money");

                amount = input.nextInt();

                setBalance(amount);
            } else if (Password != 1234) {

                System.out.println("Please again enter your password");
                Password = input.nextInt();
                s++;

            } else if (s == 1) {
                System.out.println("your account has been blocked");
            }


        } catch (
                Exception ex) {
            System.out.println(ex.getMessage());
        }


    }


    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double money) {
        if (money < balance) {
            this.balance = balance - money;
            System.out.println("Remaining Money: " + getBalance());


        } else {
            System.out.println("Insufficient funds in your account: " + getBalance());
        }

    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

}