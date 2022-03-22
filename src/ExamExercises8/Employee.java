package ExamExercises8;

public class Employee {
    private int Id;
    private String name;
    int ssn;
    public Employee(int id,String name,int ssn){
        this.name=name;
        this.Id=id;
        this.ssn=ssn;

    }
    public String getName(){
        return name;

    }

}
