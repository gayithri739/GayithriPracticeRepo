package JavaAssignment1;
class Account 
{
	private String accountHolderName ;
	private double balance;
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance<0)
		{
			System.out.println("balance should not accept negative values");
		}
		else
		{
			this.balance = balance;
		}
		
	}
	
}
public class Question12 {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccountHolderName("Anand Kumar");
		acc.setBalance(30000);
		acc.setBalance(-4800);
		
		System.out.println(acc.getAccountHolderName());
		System.out.println(acc.getBalance());
	}

}
