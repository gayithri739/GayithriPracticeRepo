package JavaAssignment1;
class LoanCalculator
{
	int calculateLoan(int amount)
	{
		
		return amount ;
		
	}
double calculateLoan(int amount, double interestRate)
	{
	return amount*interestRate/100+'%';
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		LoanCalculator lc=new LoanCalculator();
	System.out.println("Loan amount is: "+lc.calculateLoan(3000000));
	System.out.println("Total amount payable with interest is: "+lc.calculateLoan(3000000,8.5)+'%');

	}

}
