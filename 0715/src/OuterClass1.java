
public class OuterClass1{
	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		oc.display();
	}
	void display() {
		int a = 5 ;  //local variable
		class InnerClass2{ 	//local class 
			int b = 100; //local inner class의 member 변수 
			static int c = 500;  // local inner class의 static 변수 
			void print() {
				
			}
		}
		InnerClass2 ic = new InnerClass2(); 
		System.out.println(ic.b) ;// 왜 ? member 변수니까 . 
		System.out.println(InnerClass2.c); // 왜 ? static 이니까 . 
	}
}