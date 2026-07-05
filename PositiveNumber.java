// Using if statement
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number >= 0){
            System.out.println(number + " is a positive number.");
        }


    }
}
