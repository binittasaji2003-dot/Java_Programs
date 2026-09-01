import hr.*;

public class Tax {
    public static void main(String[] args){
        FullTimeEmployee21 f1 = new FullTimeEmployee21(20000);

        System.out.println("Salary: " + f1.calculateSalary());
        System.out.println("Tax: " + f1.calculateTax());
    }
}
