/* 
 * 동일 클래스의 멤버 메소드는 해당 클래스를 생성하고 그 주소로 접근해야 한다. 
 */

public class HelloWorld3 {
	public static void main(String[] args) {
		//String str = "Hello, World"; 	//local |stack | temporary | auto variable 
		System.out.println(Demo.str);  
	}
}
class Demo{
	static String str = "Hello, World"; 	// class | static variable 
}	