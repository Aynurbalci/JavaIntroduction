package ExamExercises5;

public class Car {
    public static final String companyName="Ferrari";
    public int productionYear;
    public String origin;
    public static int counter;
    public Car(int productionYear,String origin){
        this.productionYear=productionYear;
        this.origin=origin;
        counter++;

    }
}
