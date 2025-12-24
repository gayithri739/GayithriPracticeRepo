package JavaAssignment1;
class Course 
{
	void courseInfo()
	{
		System.out.println("This course includes Science,Commerce and Arts");;
	}
}
class Science extends Course{
	void ScienceCourse()
	{
		System.out.println("Science course covers Physics,chemistry and biology");
	}
}
class Commerce extends Course{
	void CommerceCourse()
	{
		System.out.println("commers course covers Accounting,Business Studies");
	}
}
class Arts extends Course
{
	void ArtsCourse()
	{
		System.out.println("Arts course covers History,Political science");
	}
}
public class HirarchicalInheritanceQ14 {

	public static void main(String[] args) {
		Course c=new Course();
		c.courseInfo();
		
		Science sc=new Science();
		sc.ScienceCourse();
		
		Commerce cm=new Commerce();
		cm.CommerceCourse();
		
		Arts ar=new Arts();
		ar.ArtsCourse();
		

	}

}
