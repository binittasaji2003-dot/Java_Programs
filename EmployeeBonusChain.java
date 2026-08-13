class Employee3{
    protected double salary;
    protected final String Companyname;

    Employee3(double salary, String Companyname){
        this.salary = salary;
        this.Companyname = Companyname;
    }

    public double calculateBonus(){
        return salary * 0.05;

    }
}
class Manager2 extends Employee3{
    Manager2(double salary, String Companyname){
        super(salary, Companyname);
    }

    @Override
    public double calculateBonus(){
        return salary * 0.10;
    }
}

class seniorManager extends Manager2{
    private int bonus;

    seniorManager(double salary,String Companyname, int bonus) {
        super(salary, Companyname);
        this.bonus = bonus;
    }

    @Override
    public double calculateBonus(){
        return ((salary * 0.15) + bonus);
    }
}

public class EmployeeBonusChain {
    public static void main(String[] args){
        seniorManager s = new seniorManager(25000, "TCS", 5000);
        System.out.println("salary: " + s.salary);
        System.out.println("Company name: " + s.Companyname);
        System.out.println("Bonus: " + s.calculateBonus());

    }
}
