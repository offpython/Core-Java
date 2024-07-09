/*
 Method를 호출하는 3가지 방법
 1) Call(Pass) by Name
 2) Call(Pass) by Value
 3) Call(Pass) by Reference
 */

class Product{
	int price;
}
public class MethodDemo2 {
	public static void main(String[] args) {
		MethodDemo2 md = new MethodDemo2();
		Product ballpen = new Product(); ballpen.price = 100;
		System.out.println("before = " + ballpen.price);
		md.change(ballpen); // Call by reference 
		//int original = 100;
		//md.print(original);  // Call by value 
		System.out.println("after = " + ballpen.price);
	}
	void change(Product pencil) { // pencil = ballpen 
		pencil.price = 50000;
		
		
	}
//	void print(int target) { // target = original 
//		System.out.println("target = " + target);
//		target = 50000; 
//		System.out.println("target = " + target);
//	}
}