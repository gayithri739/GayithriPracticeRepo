package JavaAssignment1;
class Mall 
{
	Mall ()
	{
		System.out.println("Welcome to the Mall");
	}
	Mall(String ShopName)//Parameterized constructor
	{
		this();//calling default constructor
		System.out.println("Shop name is:"+ShopName);
	}
}
public class ConstructorChaining23 {

	public static void main(String[] args) {
		
		Mall m=new Mall("Biba");
	}

}
