package ExamExercises8;

enum CompanyName{
    APPLE("asfl"),
    MICROSOFT("saf"),
    GOOGLE("sfa"),
    IBM("asf"),
    AKINSOFT("saf");

    String desp;
    private CompanyName(String desc){
        this.desp=desc;
    }

}

public class Company {
    private Employee[] employees;
    private CompanyName companyName;
    public Company(Employee [] employees,CompanyName companyName){
        this.employees=employees;
        this.companyName=companyName;

    }

    public CompanyName getCompanyName(){
        return  companyName;
    }



}
