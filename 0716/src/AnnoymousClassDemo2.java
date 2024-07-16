
public class AnnoymousClassDemo2 {
	public static void main(String[] args) {
		AnnoymousClassDemo2 acd = new AnnoymousClassDemo2();
//		Dog dog = new Dog();
//		acd.display(dog);
		acd.display(new Mammal() {
			@Override
			public void sound() {
				System.out.println("멍ㅁ엄엄엄ㅇ");
			}
		});
	}
	void display(Mammal m) {
		m.sound();
	}
}

interface Mammal{
	void sound();
}
class Dog implements Mammal{
	@Override
	public void sound() {
		System.out.println("멍멍멍멍");
	}
}