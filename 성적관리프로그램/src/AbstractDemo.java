
public class AbstractDemo {
	public static void main(String[] args) {
		Tiger t = new Lion(); t.display();
	}
}
abstract class Tiger{
	public void print() {System.out.println("나는 부모 메소드");}
	public abstract void display();
}
class Lion extends Tiger{
	public void display() {System.out.println("나는 부모 메소드");}
}
