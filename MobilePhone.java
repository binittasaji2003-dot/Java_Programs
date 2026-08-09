import java.util.Scanner;

class phone{
    private String brand;
    private String model;
    private double price;
    private int storage;

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter brand: ");
        brand = sc.next();

        System.out.print("Enter model: ");
        model = sc.next();

        System.out.print("Enter price: ");
        price = sc.nextDouble();

        System.out.print("Enter storage: ");
        storage = sc.nextInt();
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public double getPrice(){
        return price;
    }

    public int getStorage(){
        return storage;
    }

    public void display(){
        System.out.println("Mobile brand: " + brand);
        System.out.println("Mobile Model: " + model);
        System.out.println("Mobile Price: " + price);
        System.out.println("Mobile Storage: " + storage);

    }


}

public class MobilePhone {
    public static void main(String[] args){


        phone p1 = new phone();

        p1.input();
        p1.display();


    }
}
