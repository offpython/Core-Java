// stack -> kor , vd // heap -> variableDemo(eng) // out -> math 

public class VariableDemo {
	int eng = 100;	//instance variable 	(3)
	static int math = 80; //class variable   (1)
	
	public static void main(String[] args) {
		int kor = 100; //local variable (2)
		System.out.printf("수학점수 = %d\n", Demo.math); // (1)
		System.out.printf("국어점수 = %d\n", kor); // (2)
		//System.out.printf("영어점수 = %d\n",  eng); -> error
		VariableDemo vd = new VariableDemo();
		System.out.printf("영어점수 = %d\n",  vd.eng);
		Demo d = new Demo();
		System.out.printf("영어점수 = %d\n",  d.eng);
	}

}
class Demo{
	static int math = 70; //class variable
	int eng = 50; 
}