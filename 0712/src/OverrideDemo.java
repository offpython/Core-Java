
public class OverrideDemo {
    public static void main(String[] args) {
        Base parent = new Derived(); parent.display(); // "나는 자식 메소드"가 출력됨
      //Object obj = new String("Hello, World");
    }
}
// public > protected > (default) > private
/*
 Override 된 자식 메소드의 접근 범위는 부모 메소드보다 같거나 더 넓어야 한다. 
 */
class Base {
	protected void display() {System.out.println("나는 부모 메소드");}
}
class Derived extends Base {
    @Override
    void display() {System.out.println("나는 자식 메소드");}
}
