package JavaAssignment1;
interface Payment
{
	void makePayment();
	
}

class UPI implements Payment
{
	public void makePayment()
	{
		System.out.println("Enterd UPI is correct");
	}
}
class CreditCard implements Payment
{
	public void makePayment()
	{
		System.out.println("Enterd credit card number is correct");
	}
}
public class Interfaceimplementation6 {

	public static void main(String[] args) {
		
		Payment ref=new CreditCard();
		ref.makePayment();
		Payment ref1=new UPI();
		ref1.makePayment();
	}

}
