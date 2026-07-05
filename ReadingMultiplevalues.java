import java.util.Scanner;
public class ReadingMultiplevalues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter Course: ");
        String course = sc.next();

        System.out.print("Enter roll no: ");
        int roll_no = sc.nextInt();


        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("name: " + name);
        System.out.println("roll no: " + roll_no);
        System.out.println("course: " + course);
        System.out.println("mark: " + mark);






    }
}

