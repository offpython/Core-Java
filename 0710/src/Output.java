
public class Output {
	void output(Student std) {
		System.out.println("학번\t\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("-----------------------------------------------------------------------");
		std.print();
//									std.hakbun, std.kor, std.eng, std.math, std.tot, std.avg, std.grade);
	}
}