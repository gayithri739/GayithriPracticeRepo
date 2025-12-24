package JavaAssignment1;

class Shape 
{
	
	double area()
	{
		return 0;
	}
}
class Rectangle extends Shape
{
	double length=45.6;
	double breadth=87.45;
	double area()
	{
		return length*breadth;
	}
}

class Circle extends Shape
{
	double pi=3.14;
	double Radius=12.67;
	double area()
	{
		return pi*Radius*Radius;
	}
	
}
public class DynamicBindingQ8 {

	public static void main(String[] args) {
		Rectangle Rect=new Rectangle();
		System.out.println(Rect.area());
		
		Circle Cir=new Circle();
		System.out.println(Cir.area());		
		
	}

}
