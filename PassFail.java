import java.util.Scanner;
public class PassFail {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        if (mark >= 40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
