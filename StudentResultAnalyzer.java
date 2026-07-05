import java.util.Scanner;
class student{
    String name;
    int rollno;
    double mark1;
    double mark2;
    double mark3;

    double calculateTotal(){
        return mark1 + mark2 + mark3;
    }

    double calculateAverage(){
        return (mark1 + mark2 + mark3) / 3;

    }

    String findGrade() {
        if (calculateAverage() >= 90){
            return "A";
        }
        else if (calculateAverage() >= 80){
            return "B";
        }
        else if (calculateAverage() >= 70) {
            return "C";
        }
        else if (calculateAverage() >= 60) {
            return "D";
        }
        else if (calculateAverage() >= 50) {
            return "E";
        }
        else {
            return "Fail";
        }
    }
    void display(){
        System.out.println("name: " + name);
        System.out.println("Roll no: " + rollno);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);

        System.out.println("Total Mark: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + findGrade());

    }


}
public class StudentResultAnalyzer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        student s1 = new student();

        System.out.print("Enter name: ");
        s1.name = sc.next();

        System.out.print("Enter roll no: ");
        s1.rollno = sc.nextInt();

        System.out.print("Enter mark1: ");
        s1.mark1 = sc.nextDouble();

        System.out.print("Enter mark2: ");
        s1.mark2 = sc.nextDouble();

        System.out.print("Enter mark3: ");
        s1.mark3 = sc.nextDouble();

        s1.display();




    }
}
