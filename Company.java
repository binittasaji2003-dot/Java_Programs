abstract class Employees{
    protected String name;
    protected int employeeId;

    Employees(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }
    abstract void calculateSalary();
}

class developer extends Employees{
    private String programming_language;
    private int bonus;
    private int basic_salary;

    developer(String name, int employeeId,String programming_language, int bonus, int basic_salary){
        super(name, employeeId);
        this.programming_language = programming_language ;
        this.bonus = bonus;
        this.basic_salary = basic_salary;
    }

    @Override
    public void calculateSalary(){
        System.out.println("Developer Salary: " + (basic_salary + bonus));
    }
}

class manager extends Employees{
    private String department;
    private int allowance;
    private int basic_salary;

    manager(String name, int employeeId,String department, int allowance, int basic_salary){
        super(name, employeeId);
        this.department = department ;
        this.allowance = allowance;
        this.basic_salary = basic_salary;
    }

    @Override
    public void calculateSalary(){
        System.out.println("Manager Salary: " + (basic_salary + allowance));
    }
}



public class Company {
    public static void main(String[] args){
        developer d1 = new developer("Binitta", 123, "python",5000, 12000);
        manager m1 = new manager("jaimon", 221, "Computer", 4000, 30000);

        d1.calculateSalary();
        m1.calculateSalary();
    }
}
