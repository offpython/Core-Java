
public class Input1 {

	void input1(Product std) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print( "상품명 : ");
		String name = sc.next();
		std.setName(name);
		System.out.print("수량 : "); std.setQuantity(sc.nextInt());
		System.out.print("판매단가 : "); std.setQuantity(sc.nextInt());
		System.out.print("매입단가 : "); std.setQuantity(sc.nextInt());
		System.out.print("운송료 : "); std.setQuantity(sc.nextInt());
	}

}
