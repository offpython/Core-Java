
public class ArrayDemo4 {
	public static void main(String[] args) {
//		// 배열의 주소 복사
//		int [] original = {3,4,5};
//		int [] target = original;
//		target[0] = 100;
		
		// 배열의 값 복사
		int [] original = {3,4,5};
		int [] target = new int[10];
		System.arraycopy(original, 1, target, 6, 2);    //오리지날 배열, 몇번째를, 타겟 배열에, 몇번째부터, 몇개 복사? 
	}

}
