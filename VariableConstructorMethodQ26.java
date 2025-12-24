package JavaAssignment1;
class school1 
{
	String name;
	String address;
	int Streangth;
	
	school1(String name,int Streangth)
	{
		this.name=name;
		this.Streangth=Streangth;
		this.address="Banglore";
		
	}
	school1(String name,String address,int Streangth)
	{
		this.name=name;
		this.address=address;
		this.Streangth=Streangth;
	
	}
	void display()
	{
		System.out.println("name of the school:" +name);
		System.out.println("Address of the school:" +address);
		System.out.println("Streangth of the school:" +Streangth);
		System.out.println();
	}
}
public class VariableConstructorMethodQ26 {

	public static void main(String[] args) {
		school1 s=new school1("AML School", 32);
		s.display();
		
		school1 s1=new school1("Oxford","delhi", 60);
		s1.display();

	}

}
