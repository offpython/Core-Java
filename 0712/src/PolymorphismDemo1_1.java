/*
 Child : String
 Parent : Object
 */

public class PolymorphismDemo1_1 {
	public static void main(String[] args) {
		String str = "Hello, World";
		Object original = str; // 자식이 부모형으로 자동 형변환 
		//if(original instanceof String) System.out.println("된다.");
		//else System.out.println("안된다.");
		String target = (String)original; // 부모가 자식으로 강제 형변환
		System.out.println(target);
	}
}