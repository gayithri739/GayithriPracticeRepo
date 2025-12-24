package JavaAssignment1;
class Student1
{
	static String collegeName ="BMSIT";
	String name ;
	int rollNo;
	
	Student1(String Name,int RollNo)
	{
		
		name=Name;
		rollNo=RollNo;
	}
	void display()
	{
		System.out.println(collegeName+" "+name+" "+rollNo);
	}
}
public class StaticKeywordQ10 {

	public static void main(String[] args) {
		Student1 Std=new Student1("Saras",123);
		Std.display();
		
		Student1 Std1=new Student1("Anand",124);
		Std1.display();
		
		Student1 Std3=new Student1("Bindu",125);
		Std3.display();
		
		Student1 Std4=new Student1("Jhon",126);
		Std4.display();

	}

}
