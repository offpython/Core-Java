
public class NestedLoopDemo {

	public static void main(String[] args) {
		int i = 1; // i 초기화 
		while(i<=9) { //i 조건
			int dan = 2;  //  dan 초기화 
			while(dan <= 9) { //dan 조건 
				System.out.printf("%d * %d = %d%n", dan, i , dan * i);
				dan++; //dan 증감식 
			}
			System.out.println();
			i++;// i 증감식
		}
	}
}
