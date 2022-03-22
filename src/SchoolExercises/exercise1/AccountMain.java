package SchoolExercises.exercise1;

import SchoolExercises.exercise1.Account;

public class AccountMain {
    public static void main(String[] args) {
      Account account=new Account("Aynur",100);
      account.deposit(50);
        account.setBalance(300);
      System.out.printf("hesaptaki deger:"+account.getBalance());


    }


}
