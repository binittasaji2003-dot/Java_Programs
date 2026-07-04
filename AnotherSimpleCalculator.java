import java.util.Scanner;
public class AnotherSimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int Sum = a + b;
        int Difference = a - b;
        int product = a * b;
        int Quotient = a / b;

        System.out.println("Sum: " + Sum);
        System.out.println("Difference: " + Difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + Quotient);

        sc.close();
    }
}
