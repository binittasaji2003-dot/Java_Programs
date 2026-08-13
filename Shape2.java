class shape1{
    protected String name;

    shape1(String name){
        this.name = name;
    }

    public void describe(){
        System.out.println("name: " + name);
    }
}

class circle1 extends shape1{
    private double radius;

    circle1(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public void describe(){
        super.describe();
        double area = Math.PI * radius * radius;
        System.out.print("Area: " + area);
    }
}

public class Shape2 {
    public static void main(String[] args){
        circle1 c1 = new circle1("Circle", 5);

        c1.describe();

    }
}
