package School.Lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{

            int input;
            System.out.printf("Lütfen değer giriniz");
            input=scanner.nextInt();



        } catch (InputMismatchException ex){
            System.out.printf(ex.getMessage());
        }
    }
}
