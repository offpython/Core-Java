
public class OpDemo {

	public static void main(String[] args) {
//		short su = ~5;
//		short result = ~su; // 단항 연산 +, -, ~ 결과는 int 
		short result = true ? 1970 : 3.14; // 삼항 연산자는 참거짓을 먼저 봄 (1970.0 -> short 형 불가 = false) => error
		
	}

}
