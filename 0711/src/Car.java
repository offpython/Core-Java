
public class Car {
	 String name;
	 int price;
//	 // 기본생성자
//	 private Car() {
//		 this.name = null;
//		 this.price = 0;
//	 }
	public void setName(String name) {
		this.name = name;			// This 생략 X
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return this.name;			// This 생략 O
	}
	public int getPrice() {
		return this.price;
	}
	public Car clone() {		//자동차 복제(주소 복사)
		return this;
	}
}
	