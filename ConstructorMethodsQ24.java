package JavaAssignment1;
class school 
{
	String name;
	school()
	{
		name="Oxford";
		System.out.println("Name of the school is: " +name);
	}
	void display()
	{
		System.out.println("This School is based out of Kolkata");
	}
}
public class ConstructorMethodsQ24 {

	public static void main(String[] args) {
		school s=new school();
	
		s.display();
		
	}

}

