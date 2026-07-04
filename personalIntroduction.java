import java.util.Scanner;
public class personalIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Hi I am " + name + ".");
        System.out.println("I am " + age + " years old.");


    }
}
