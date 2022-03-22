package ExamExercises8;

public class Main {
    public static void main(String [] args){

        Employee employee=new Employee(14,"ayse",1234);
        Employee employee2=new Employee(15,"dilek",325);
        Employee employee3=new Employee(16,"Ahmet",646);
        Employee employee4=new Employee(17,"Mahmad",76);

       Employee [] emps={employee,employee2,employee3,employee4};
     Company company=new Company(emps,CompanyName.APPLE);

       for(Employee e:emps){
           System.out.println(e.ssn);
       }
        for (int i=0;i<emps.length;i++){
            System.out.println(emps[i].getName());
        }

    }
}

