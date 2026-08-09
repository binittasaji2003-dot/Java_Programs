import java.util.Scanner;

class phone1{
    private String brand;
    private String model;
    private double price;
    private int storage;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setStorage(int storage){
        this.storage = storage;
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

public class mobile2 {
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            // Taking input from user
            System.out.print("Enter brand: ");
            String brand = sc.next();

            System.out.print("Enter model: ");
            String model = sc.next();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter storage: ");
            int storage = sc.nextInt();


        phone1 p1 = new phone1();
        p1.setBrand(brand);
        p1.setModel(model);
        p1.setStorage(storage);
        p1.setPrice(price);
        p1.display();


    }
}
