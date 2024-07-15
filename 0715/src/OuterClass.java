//member inner class 
public class OuterClass{
	public static void main(String[] args) {
		OuterClass oc = new OuterClass(); 
		OuterClass.InnerClass ic = oc.new InnerClass();
		System.out.println(ic.c);
		System.out.println(InnerClass.d); //static
	}
	private int a = 5;  //outer class의 member 변수
	private static int b = 10; //outer class의 static 변수
	private class InnerClass{ //member의 inner class 
		private int c = 100; //inner class의 member 변수 
		private static int d = 500; // inner class의 static 변수
		public void display(){ //inner class의 member 메소드
			System.out.println(a + ", " + b + ", " + c + ", " + d);
				
		}
		public static void print() {
			System.out.println(); //inner class의 static 메소드 
		}
	}
}
