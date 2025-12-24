package JavaAssignment1;
class Shape1 
{
	final double pi=3.14;
	float length;
	void square ()
	{
		float area=4*length;
		System.out.println("Area of the square is:" +area);
	}
	void rectangle(float breadth)
	{
		float area=length*breadth;
		System.out.println("Area of the rectangle is:" +area);
	}
	void circle()
	{
		
		double area=pi*length*length;
		System.out.println("Area of the circle is:" +area);
	}
}

public class ShapeQ24 {

	public static void main(String[] args) {
		Shape1 s=new Shape1();
		s.length=8;
		s.square();
		s.rectangle(6.7f);
		s.circle();
		
	}

}
