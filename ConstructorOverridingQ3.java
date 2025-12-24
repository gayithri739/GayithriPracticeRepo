package JavaAssignment1;
class Product 
{
	int productId;
	String productName;
	float price;

Product()
{
	System.out.println("Product Created");
}
Product(int productId,String productName,float price)
{
	this.productId=productId;
	this.productName=productName;
	this.price=price;
}
void display()
{
	System.out.println(productId+" "+productName+" "+price);
}
}
public class ConstructorOverridingQ3 {

	public static void main(String[] args) {
		
		Product p=new Product();
		Product p1=new Product(1234,"Jhon",7000000f);
		p1.display();
		
	}

}
