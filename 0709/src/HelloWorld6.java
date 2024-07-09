/* 
 * 동일 클래스의 멤버 메소드는 해당 클래스를 생성하고 그 주소로 접근해야 한다. 
 */

public class HelloWorld6 {
	public static void main(String[] args) {
		HelloWorld5 hw = new HelloWorld5();
		hw.print();
	} 
	static void print() { //member | instance method
		System.out.println("Hello, World");
	}	
}
