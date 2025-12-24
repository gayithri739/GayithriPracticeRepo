package JavaAssignment1;
interface Transport 
{
	void booking();
}

class Bus implements Transport
{
	public void booking() {
	System.out.println("Bus is booked");
		
	}

}
class flight implements Transport
{
	public void booking() 
	{
		System.out.println("flight is booked");
			
	}
}
public class InterfaceQ18 {

	public static void main(String[] args) {
		Transport ref=new Bus();
		ref.booking();
		
		Transport ref1=new flight();
		ref1.booking();
		
	}

}
