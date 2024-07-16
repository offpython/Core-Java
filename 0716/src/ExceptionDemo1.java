
public class ExceptionDemo1 {
	public static void main(String[] args) {
		Car matiz = new Car();
		matiz.name = "대우 마티즈";
		System.out.println(matiz.name);
		matiz = null;
		try {
			System.out.println(matiz.name);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("아무일 없었음");
//			// 에러 메세지를 보여주는 단계 
////			System.out.println(e.getMessage());  // -> 에러 메세지만
////			System.out.println(e); // e.toString() -> exception type/에러 메세지
//			e.printStackTrace();  //stack 추적 -> 라인 수/exception type/에러 메세지
			}catch(NegativeArraySizeException e) {
				System.out.println("배열의 크기는 음수이면 안됩니다.");
			}catch(RuntimeException e) {
				System.out.println("여기서 잡았음.");
			}
		}
}