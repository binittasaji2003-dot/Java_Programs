abstract class shape{
    protected String name;

    shape(String name){
        this.name = name;
    }

    abstract void calculateArea();
}

class circle extends shape{
    private double radius;


    circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of circle: " + Math.PI *  radius * radius);
    }
}

class rectangle extends shape{
    private int length;
    private int breadth;

    rectangle(String name, int length, int breadth){
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of rectangle: " + length * breadth);
    }

}


public class Abstract {

    public static void main(String[] args){
        circle c1 = new circle("Circle", 5);
        rectangle r1 = new rectangle("Rectangle", 6, 5);

        c1.calculateArea();
        r1.calculateArea();
    }
}
