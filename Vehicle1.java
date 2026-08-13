class Vehicle{

    protected String regNo;
    protected double dailyRate;

    public Vehicle(String regNo, double dailyRate){
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }

    public double computeRent(int days){
        return dailyRate * days;
    }
}

class car2 extends Vehicle{
    private int numDoors;

    public car2(String regNo, double dailyRate, int numDoors){
        super(regNo, dailyRate);
        this.numDoors = numDoors;
    }

    @Override
    public double computeRent(int days){
        return super.computeRent(days) + 200;
    }
}



public class Vehicle1 {
    public static void main(String[] args){
        car2 c1 = new car2("KL35A903", 1000, 4);

        System.out.println("car rent: " + c1.computeRent(5));
    }
}
