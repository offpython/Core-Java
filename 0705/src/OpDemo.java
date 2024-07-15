/* 값 입력(초단위) : 3601
3601초는 1시간 1초입니다.  */

public class OpDemo{
	public static void main(String [] args) {
		//short su = 5;
		//short result = ~su;
//		short result = true ? 1970 : 3.14; 
//       ㄴ삼항 연산자는 참거짓을 먼저 봄 (1970.0 -> short 형 불가 = false) => error
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("값 입력(초단위) : ");
		int time = sc.nextInt();
		int hours = time / 3600;
		int miniutes = time % 3600 / 60;
		int seconds = time % 3600 % 60;
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", 
								 	time, hours,miniutes,seconds);	
	}
}