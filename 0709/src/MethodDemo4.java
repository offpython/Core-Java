
public class MethodDemo4 {
	public static void main(String[] args) {
		MethodDemo4 md = new MethodDemo4(); 
		int result = md.calcHap(10, 50);
		System.out.println(result);
		result = md.calcHap(1, 100);
		System.out.println(result);
		result = md.calcHap(50, 70);
		System.out.println(result);
	}
	int calcHap(int start, int end){ 	// static 없음 -> member method | 주소 필요 
		int hap = 0; 
		for(int i = start ; i <= end; i++) {
			hap += i;
		}
		return hap; 
	}
}