
public class DoDemo {

	public static void main(String[] args) {
		// 4!=4*3*2*1
		String y_n = null; //null 번지 
		java.util.Scanner sc = new java.util.Scanner(System.in);
		do {
			System.out.print("몇 Factorial ? : ");
			int su = sc.nextInt();
			int answer = 1;
			for(int i = su; i > 0; i--) {
				answer *= i;	
			}
			System.out.println(su + "! =" + answer);
			System.out.print("Againt(y/n)?");
			y_n = sc.next(); 
		} while (y_n.equals("Y") || y_n.equals("y")); 	
	}
}