// 4. 부모 생성자는 상속되지 않는다. 
// 자식 생성자는 부모의 기본생성자만 호출한다.
// super 메소드는 자식 생성자에서 임의로 부모 생성자를 호출 할 때 사용한다.
// 반드시 생성자 안에서만 사용해야 하고, 생성자 안에서 반드시 첫번째 위치해야한다. 
public class InheritanceDemo3 {
	public static void main(String[] args) {
		Sonata sonata = new Sonata("EF Sonata", 30_000_000);
	}
}
	class Car{
		String name;
		public Car(String name) {this.name = name;}
}
class Sonata extends Car {
	int price;
//	public Sonata(int price) {this.price = price;}
	public Sonata(String name, int price) {
		super(name);
		this.price= price; 
	  }
}	

