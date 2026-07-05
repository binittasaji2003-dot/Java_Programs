import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

void display(){
    System.out.println("Length :" + length);
    System.out.println("width :" + width);
    System.out.println("height :" + height);

}
void calculateVolumn(){
    System.out.println("Volumn: "+ (length * width * height));
    }

    Double calculatearea() {
        return length * width;
    }
}

public class Boxclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Box b1 = new Box();

        System.out.print("Enter length: ");
        b1.length = sc.nextDouble();

        System.out.print("Enter width: ");
        b1.width = sc.nextDouble();

        System.out.print("Enter height: ");
        b1.height = sc.nextDouble();

        b1.display();
        b1.calculateVolumn();

        System.out.println("Area of the box : " + b1.calculatearea());





    }

}
