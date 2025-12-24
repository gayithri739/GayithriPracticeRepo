package JavaAssignment1;
class Employee
{
	private int empId;
	private String empName;
	private float salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	void displayDetails(int empId,String empName,float salary)
	{
		System.out.println(empId+ " "+empName+ " "+salary);
	}
	
}
public class EncapsulationAss1 {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.displayDetails(1234,"Harish",3000000);
		
	}

}
