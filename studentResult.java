import java.net.SocketOption;
import java.util.Scanner;
public class studentResult {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Mark2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Mark3: ");
        int mark3 = sc.nextInt();

        double Total = mark1 + mark2 + mark3;
        double Average = Total / 3;

        System.out.println("Total: " + Total);
        System.out.println("Average: " + Average);





    }
}
