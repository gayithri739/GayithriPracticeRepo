package JavaAssignment1;
class LoanCalculator1
{
	void calculateLoan(int amount)
	 {
		double interestRate=5.6; 
		double interest=amount*interestRate/100;
		double Total=amount+interest;
		System.out.println("Loan amount is :"  +amount);
		System.out.println("Loan interest is :"+interest +"%");
		System.out.println("Total payable amount is :" +Total);
	 }
	void calculateLoan(int amount, double interestRate)
	{
		
		double interest=amount*interestRate/100;
		double Total=amount+interest;
		System.out.println("");
		System.out.println("Loan amount is :"  +amount);
		System.out.println("Loan interest is :"+interestRate +"%");
		System.out.println("Total payable amount is :" +Total);
	}
}
public class MethodOverloadingQ15 {

	public static void main(String[] args) {
		
		LoanCalculator1 lc=new LoanCalculator1();
		lc.calculateLoan(3000000);
		lc.calculateLoan(2000000, 10);
	}

}
