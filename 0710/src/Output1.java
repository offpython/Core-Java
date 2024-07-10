
public class Output1 {
	void output(Product std) {
		System.out.println("                           <<상품별 판매 이익금 및 이익률표>>                        ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("상품명\t\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익률");
		System.out.println("-----------------------------------------------------------------------");
		std.print();
	}
}
