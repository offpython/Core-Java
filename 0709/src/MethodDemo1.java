/*
 Method를 호출하는 3가지 방법
 1) Call(Pass) by Name
 2) Call(Pass) by Value
 3) Call(Pass) by Reference
 */

// 2) Call(Pass) by Value
public class MethodDemo1 {
	public static void main(String[] args) {
		MethodDemo1 md = new MethodDemo1(); 
		md.calcHap(10, 50);
	}
	void calcHap(int start, int end){ 	// static 없음 -> member method | 주소 필요 
		int hap = 0; 
		for(int i = start ; i <= end; i++) {
			hap += i;
		}
		System.out.println(start + "부터 " + end + "까지의 합은 " + hap + "입니다.");
	}
}