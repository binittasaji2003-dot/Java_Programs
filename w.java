abstract class shape{


	final void display(){
		System.out.println("Shape created");
	}

	abstract double area();

	

}

class TwoDShape extends shape{
	
	TwoDShape(){
		System.out.println("TwoDShape created");
	}

	@Override
	double area(){
		return 0;
	}
	
}

class Circle extends TwoDShape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}

	@Override
	double area(){
		return 3.14 * radius * radius;
	}

	
}

public class w{
	public static void main(String[] args){
		Circle c1 = new Circle(7.0);


		c1.display();
		System.out.println("Area of circle: " + c1.area());
	}

}