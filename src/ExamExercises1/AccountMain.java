package ExamExercises1;

import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {

        Account account = new Account("Aynur", 500);
        int b = 0;
        System.out.printf("Welcome to A bank would you like to do?%n");

        try {
            while (b < 3) {


                System.out.printf("1.Withdraw the money %n 2.Add money %n");
                System.out.printf("3.See my money %n");
                b++;


                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                switch (a) {
                    case 1:
                        account.withdraw(500);
                        break;
                    case 2:
                        System.out.printf("Add money whathever you want %n");
                        account.add(scanner.nextInt());
                        break;
                    case 3:
                        System.out.printf("Your money is:" + account.getBalance());
                        break;
                    default:
                        System.out.printf("Wrong value enter %n");
                        break;
                }


            }

        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }
}
