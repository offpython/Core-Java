/*
 Method를 호출하는 3가지 방법
 1) Call(Pass) by Name
 2) Call(Pass) by Value
 3) Call(Pass) by Reference
 */

//1) Call(Pass) by Name
public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo(); md.calcHap();
	}
	void calcHap(){ 	// static 없음 -> member method | 주소 필요 
		int hap = 0; 
		for(int i = 0 ; i < 101; i++) {
			hap += i;
		}
		System.out.println("1부터 100까지의 합은 " + hap + "입니다.");
	}
}
