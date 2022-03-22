package ExamExercises2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Excp {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Lutfen deger giriniz");
            int a=scanner.nextInt();

        }
        catch (InputMismatchException ex){
            System.out.printf(ex.getMessage());
        }



    }
}
