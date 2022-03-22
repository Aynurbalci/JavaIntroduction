package ExamExercises3;

import java.util.InputMismatchException;

public class Exceptions {
    public static void main(String[] args) {


        try{
            int a=40/0;
            System.out.println(a);
        }
        catch (InputMismatchException b){
            System.out.println(b.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("done");
        }



    }
}
