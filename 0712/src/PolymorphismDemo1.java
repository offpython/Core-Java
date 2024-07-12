/*
 Child : String
 Parent : Object
 */

public class PolymorphismDemo1 {
	public static void main(String[] args) {
//		Child younghee = new Child(); younghee.display();
		Parent jimin = new Parent(); Child younghee = new Child();
		jimin = younghee; //자동형변환
		jimin.display();
	}
}
class Parent{
	public void display() {System.out.println("나는 부모 메소드");}
}
class Child extends Parent{
	@Override
	public void display() {System.out.println("나는 자식 메소드");}
}