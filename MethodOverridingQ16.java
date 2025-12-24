package JavaAssignment1;
class Hospital
{
	void emergencyService()
	{
		System.out.println("Service is available 24/7");
	}
}
class CityHospital extends Hospital
{
	 void emergencyService()
	{
		 super.emergencyService();
		 System.out.println("Cityhospitals as advanced emergencyservice");
		 
	}
}
public class MethodOverridingQ16 {

	public static void main(String[] args) {
		CityHospital ch=new CityHospital();
		ch.emergencyService();
	}

}
