//member inner class 

public class OuterClass2{
	public static void main(String[] args) {
		OuterClass2.InnerClass1 ic = new OuterClass2.InnerClass1();
		ic.display();
		ic.print();
	}
	private int a = 5;  //outer class의 member 변수
	private static int b = 10; //outer class의 static 변수
	private class InnerClass1{ //member의 static class 
		private int c = 100; //static inner class의 member 변수 
		private static int d = 500; // static inner class의 static 변수
		public void display(){ //static inner class의 member 메소드
			System.out.println( b + ", " + c + ", " + d);
				
		}
		public static void print() { // static inner classs의 static 메소드
			System.out.print(b + ", " + d);
		}
	}
}
