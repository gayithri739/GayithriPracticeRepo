package JavaAssignment1;
abstract class Animal 
{
 abstract void sound();
 {
	 System.out.println("Sound of the Animals");
 }
}
class Dog extends Animal 
{
  void sound() 
 {
     System.out.println("Dog barks: Woof Woof!");
 }
}

class Cat extends Animal
{
 void sound() 
 {
     System.out.println("Cat meows: Meow Meow!");
 }
}

public class AbstractionAss5 {

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.sound();
	    Cat obj1 = new Cat();
	    obj1.sound();
	}

}
