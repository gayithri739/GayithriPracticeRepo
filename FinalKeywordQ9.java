package JavaAssignment1;
class Bank
{
	final String IFSC="BANK7890000";
	final void showIFSC()
	{
		System.out.println("IFSC code is:" +IFSC);
	}
}
class HDFCBank extends Bank //overriding Bank
{
	void showIFSC()//Compile time error,Final method can't be overridden
	{
		
		System.out.println("IFCS code is:" +IFSC);
	}
}
public class FinalKeywordQ9 {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.showIFSC();
		
		HDFCBank B1=new HDFCBank();
		B1.showIFSC()
		
	}

}
