
public class WrapperDemo {
	public static void main(String[] args) {
//		int su = 5; //stack에 있는 5 
//		Integer in = new Integer(su); //Wrapping, Boxing // heap에 있는 5
//		int another = Integer. //unwrapping, unboxing 
		int su = 5; 
		Integer in = su * 100; //autoboxing
		int another = in; //autounboxing 
		System.out.println(another);
		
	}

}
