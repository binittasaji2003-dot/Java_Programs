import java.util.Scanner;
class employee{
    int employeeid;
    String employeeName;
    double basicsalary;


    void displayData() {
        System.out.println("Employee Details");
        System.out.println();
        System.out.println("Employee id: " + employeeid);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic salary: " + basicsalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Net Salary: " + calculateNetSalary());

    }

    double calculateHRA(){
        return basicsalary * 0.20;
    }

    double calculateDA(){
        return basicsalary * 0.10;
    }

    double calculateNetSalary(){
        return basicsalary + calculateDA() + calculateHRA();
    }
}

public class EmployeeSalryCalculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        employee e1 = new employee();

        System.out.print("Enter Employee id: ");
        e1.employeeid = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        e1.employeeName = sc.next();

        System.out.print("Enter Basic Salary: ");
        e1.basicsalary = sc.nextDouble();

        e1.displayData();


    }
}
