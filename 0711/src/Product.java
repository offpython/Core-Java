
public class Product {
	String name;
	int price;
	String maker;
	public Product() {} //Default Constructor -> 에러 나지 않게 만듦 
	public Product(String name, int price, String maker) {	//Constructor
		this.name = name;
		this.price= price;
		this.maker = maker;
	}
}
