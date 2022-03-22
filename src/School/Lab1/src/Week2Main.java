package School.Lab1.src;

import java.util.Scanner;


public class Week2Main {
    public static void main(String[] args) {
Employee employee=new Employee();
employee.name="Aynur";
employee.wage=0.67f;
employee.socialSecurityNumber=132424;
employee.workingHours=12;
//employee.displayInfo();
//employee.displaySalary();
Scanner input=new Scanner(System.in);

        System.out.println("Enter the name");
        employee.name=input.nextLine();
        System.out.println("Enter the wage ");
        employee.wage=input.nextFloat();
        System.out.println("Enter the Social Security Number");
        employee.socialSecurityNumber=input.nextInt();
        System.out.println("Enter the Working Hours");
        employee.workingHours=input.nextInt();
        employee.displayInfo();
        employee.displaySalary(employee.wage,employee.workingHours);


    }
}
