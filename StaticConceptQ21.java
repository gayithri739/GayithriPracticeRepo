package JavaAssignment1;
class University 
{
	static String country ="India";
	String universityName;
	University(String universityName )
	{
		this.universityName=universityName;
	}
	void display()
	{
		System.out.println("University name is:"+universityName);
		System.out.println("Country name is:"+country);
		System.out.println();
	}
}
public class StaticConceptQ21 {

	public static void main(String[] args) {
		University ur=new University("VTU");
		ur.display();
		
		University ur1=new University("Banglore");
		ur1.display();
	}

}
