import java.util.Scanner;
public class NumberPatternAnalyzer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
        int sum = 0;
        for(int j=1; j<=n; j++) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        int odd = 0;
            for(int k=1; k<=n; k++){
                if(k % 2 != 0){
                    odd += 1;
                }

            }
            int largest = 5;
            for(int l=1; l<=n; l++){
                if(l % 5 == 0){
                    largest = l;
                }

            }
        System.out.println(" ");
        System.out.println("Sum: " + sum);
            System.out.println("Odd: " + odd);
            System.out.println("largest : " + largest);

        }
}
