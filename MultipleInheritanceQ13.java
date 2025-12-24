package JavaAssignment1;
class Device
{
	void Start()
	{
		System.out.println("ON the device");
	}
}
class Mobile extends Device
{
	void calling()
	{
		System.out.println("Calling to the mobile");
	}
}
class SmartPhone extends Mobile
{
	void internet()
	{
		System.out.println("Allow internet access to smartphone");
	}
}
public class MultipleInheritanceQ13 {

	public static void main(String[] args) {
		
		SmartPhone sp=new SmartPhone();
		sp.Start();
		sp.calling();
		sp.internet();
		
	}

}
