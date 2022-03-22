package ExamExercises6;

public class Worker {
    String name;
    float salary;
    public static int counter;
    public void setName(String setName){

    }
    public void setSalary(float setSalary){
        if(setSalary<0)
            throw new IllegalArgumentException("Salary amaount must be greater than zero");

    }
}
