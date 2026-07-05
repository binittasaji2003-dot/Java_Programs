// Nested if else
import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        if (username.equals("admin")) {
            System.out.print("Enter password: ");
            int password = sc.nextInt();
            if (password == 1234) {
                System.out.println("Login Successful...");
            } else {
                System.out.println("password is not correct");
            }
        }
        else {
            System.out.println("Username is not corrcet");
            }
        }

}
