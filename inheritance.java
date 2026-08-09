import java.util.Scanner;
class Employee1{
    private int employee_id;
    private String employeeName;


    public void setId(int employee_id){
        this.employee_id = employee_id;
    }

    public void setName(String employeeName){
        this.employeeName = employeeName;
    }

    public int getId(){
        return employee_id;
    }

    public String getName(){
        return employeeName;
    }


}
class Manager1 extends Employee1{
    private String department;
    private double salary;

    public void setDepartment(String department){
        this.department = department;

    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getDepartment(){
        return department;
    }

    public Double getSalary(){
        return salary;
    }

}

public class inheritance {
    public static void main(String[] args) {
        Manager1 m1 = new Manager1();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee id:");
        int id = sc.nextInt();

        System.out.print("Enter Employee name:");
        String name = sc.next();

        System.out.print("Enter Employee department:");
        String department = sc.next();

        System.out.print("Enter Employee salary:" );
        Double salary = sc.nextDouble();


        m1.setId(id);
        m1.setName(name);
        m1.setDepartment(department);
        m1.setSalary(salary);

        System.out.println("Employeee id: " + m1.getId());
        System.out.println("Employeee name: " + m1.getName());
        System.out.println("Employeee department: " + m1.getDepartment());
        System.out.println("Employeee salary: " + m1.getSalary());



    }
}