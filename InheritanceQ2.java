package JavaAssignment1;
class Vehicle 
{
	void fuelType()
	{
		System.out.println("Runs on fuel");
	}
}
class ElectricCar extends Vehicle
{
	void fuelType()
	{
		System.out.println("Runs on electricity");
	}
}
public class InheritanceQ2 {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.fuelType();
		
		ElectricCar e=new ElectricCar();
		e.fuelType();
	}

}
