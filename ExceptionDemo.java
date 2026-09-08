import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            System.out.println("name: " + name);
            System.out.println("age: " + age);
            System.out.println("salary: " + salary);

        } catch(InputMismatchException e){
            System.out.print("invalid data type");
        }
    }
}
