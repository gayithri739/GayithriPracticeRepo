package JavaAssignment1;
class Camera
{
	void capture()
	{
		System.out.println("Capture the photo");
	}
}
class DSLCamera extends Camera
{
	 void capture()
	{
		 System.out.println("Well advanced option to capture the photo");
	}
}
public class PolymorphismRunUPQ19 {

	public static void main(String[] args) {
		Camera c=new DSLCamera();
				c.capture();
	}

}
