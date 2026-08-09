import java.util.Scanner;

public class fileHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");

        if (sc.hasNextInt()) {

            int age = sc.nextInt();

            System.out.print("Enter Percentage: ");

            if (sc.hasNextDouble()) {

                double percentage = sc.nextDouble();

                System.out.print("Number of subjects: ");

                if (sc.hasNextInt()) {

                    int sub = sc.nextInt();

                    System.out.print("Enter attendance: ");

                    if (sc.hasNextDouble()) {

                        double attend = sc.nextDouble();

                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Percentage: " + percentage);
                        System.out.println("Number of subjects: " + sub);
                        System.out.println("Attendance: " + attend);

                    } else {
                        System.out.println("Invalid attendance. Please enter a double.");
                    }

                } else {
                    System.out.println("Invalid number of subjects. Please enter an integer.");
                }

            } else {
                System.out.println("Invalid percentage. Please enter a double.");
            }

        } else {
            System.out.println("Invalid age. Please enter an integer.");
        }

        sc.close();
    }
}