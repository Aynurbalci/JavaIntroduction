package ExamExercises4;

public class TimeMain {
    public static void main(String [] args){
        try {
            Time1 time=new Time1(4,59,65);
            System.out.println(time.toString());
        }catch (Exception ex){
            System.out.println(ex.getMessage());

        }
        finally {
            System.out.println("done");
        }






    }


}
