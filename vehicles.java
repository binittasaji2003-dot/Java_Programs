class vehicle{
    protected String brand;
    protected int year;

    vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
}
class car extends vehicle {
    private String model;

    car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    void display(){
        System.out.println(" car brand: " + brand);
        System.out.println(" year: " + year);
        System.out.println(" car model: " + model);
    }
}


public class vehicles {
    public static void main(String[] args){
        car c1 = new car("Ford", 2010, "Ecospot");

        c1.display();
    }
}
