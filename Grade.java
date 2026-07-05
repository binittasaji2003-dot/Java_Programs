// if else if ladder
import java.util.Scanner;

public class Grade {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        if (mark > 90) {
            System.out.println("S Grade");
        }
        else if (mark > 80) {
            System.out.println("A Grade");
        }
        else if (mark > 70) {
            System.out.println("B Grade");
        }
        else if (mark > 60) {
            System.out.println("C Grade");
        }
        else if (mark > 50) {
            System.out.println("D Grade");
        }
        else if (mark > 40) {
            System.out.println("E Grade");
        }
        else {
            System.out.println("Failed, Better luck Next time.");
        }
    }
}
