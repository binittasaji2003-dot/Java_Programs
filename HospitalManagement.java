abstract class Employee2{
    protected String name;
    protected int EmployeeId;

    Employee2(String name, int EmployeeId){
        this.name = name;
        this.EmployeeId = EmployeeId;

    }

    abstract void calculateEarnings();
    abstract void display();
}

class doctor extends Employee2{
    private String specilization;
    private double fee;
    private int number_of_patiens;

    doctor(String name, int EmployeeId, String specilization, double fee, int number_of_patiens){
        super(name, EmployeeId);
        this.specilization = specilization;
        this.fee = fee;
        this.number_of_patiens = number_of_patiens;
    }

    @Override
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Employee Id: " + EmployeeId);
        System.out.println("Specilization: " + specilization);
        System.out.println("fee: " + fee);
        System.out.println("number of patients: " + number_of_patiens);
    }

    @Override
    public void calculateEarnings(){
        System.out.println("Earning: " + (fee * number_of_patiens));
    }
}

class nurse extends Employee2{
    private String department;
    private int working_hours;
    private int hourly_rate;

    nurse(String name, int EmployeeId, String department, int working_hours, int hourly_rate){
        super(name, EmployeeId);
        this.department = department;
        this.working_hours = working_hours;
        this.hourly_rate = hourly_rate;
    }

    @Override
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Employee Id: " + EmployeeId);
        System.out.println("department: " + department);
        System.out.println("working_hours: " + working_hours);
        System.out.println("hourly_rate: " + hourly_rate);
    }

    @Override
    public void calculateEarnings(){
        System.out.println("Earning: " + (hourly_rate * working_hours));
    }
}


public class HospitalManagement {
    public static void main(String[] args){
        Employee2[] emp = {
                new doctor("Binitta", 123, "Phyiotheraphy", 1200,10),
                new nurse("Joyce",221,"Theraphy", 8, 500),
        };
        for (Employee2 e : emp){
            e.calculateEarnings();
            e.display();
        }
    }
}


