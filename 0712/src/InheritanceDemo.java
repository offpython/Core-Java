// 1. overshadow 변수, override 변수는 상속되지 않는다.
public class InheritanceDemo /*extends Object  => 모든 클래스는 오브젝트의 자식이라 생략됨*/{

	public static void main(String[] args) {
//		Mammal m = new Mammal(); m.display();
		Horse h = new Horse(); // h.display();
		System.out.println(h.toString());  //Horse@28a418fc
	}
}
//class Mammal /*extends Object  => 모든 클래스는 오브젝트의 자식이라 생략됨*/{
//	public void display() {
//		System.out.println("나는 포유류");
//	}
//}
class Horse extends Mammal{
	@Override 
	public String toString() {
		return "나는 제주말입니다.";
	}
}
// @Override 	
//	public void display() {
//		super.display();		//super=parents
////		System.out.println("나는 제주말이야.");
//	}
//}