// Nested if
import java.util.Scanner;

public class License {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.print("Has licence or not (true or false): ");
            boolean haslicence = sc.nextBoolean();
            if (haslicence == true ){
                System.out.println("You can drive");

            }
        }
    }
}
