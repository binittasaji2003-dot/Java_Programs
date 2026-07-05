import java.util.Scanner;
public class MultiplicationTable1 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the number: ");
         int number = sc.nextInt();

         for (int i = 1; i <= number; i ++){
             for (int j = 1; j <= 10; j++){
                 System.out.println(j +" * " + i + " = " + (j * i) );

             }
         }

    }
}
