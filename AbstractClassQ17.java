package JavaAssignment1;
abstract class Employee1
{
	String EmpName;
	
	abstract double calculateSalary();
	
	void employeeDetails()
	{
		
		System.out.println("Employee name is:"+EmpName );
	}
	
}
class FullTimeEmployee extends Employee1
{
	 double Salary;
	 FullTimeEmployee(String EmpName,double Salary)
	 {
		 this.EmpName=EmpName;
		this. Salary=Salary;
		 
	 }
	
	double calculateSalary() 
	{
		return Salary;
	}
}
 class PartTimeEmployee extends Employee1
 {
	
	int hour;
	double Salary;
	double rate;
	PartTimeEmployee(String EmpName,double rate,int hour)
	{
		this.EmpName=EmpName;
		this.rate=rate;//rate is a salary paid for 1 hour
		this.hour=hour;
	}
	
	double calculateSalary() 
	{
		return rate*hour;
	}
 }
public class AbstractClassQ17 {

	public static void main(String[] args) {
		Employee1 fe= new FullTimeEmployee("Anand",3000000);
		fe.employeeDetails();
		System.out.println("Salary is:"+fe.calculateSalary());
		System.out.println("");
		Employee1 pe=new PartTimeEmployee("Bindu",100,24);
		pe.employeeDetails();
		System.out.println("Salary is:"+pe.calculateSalary());
	}

}
