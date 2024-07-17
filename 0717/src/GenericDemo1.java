import java.util.Vector;

public class GenericDemo1 {
	public static void main(String[] args) {
//		Object obj = "Hello";
//		java.util.Vector<Object> v1 = new java.util.Vector<String>();
//		java.util.Vector v1 = new java.util.Vector(); //raw type
//		Vector<?> v1 = new Vector<?>(); // wildcard type 
//		v1.add(5);
//		Product<Integer> pencil = new Product<Integer>(1000);
//		Product<Double> ballpen = new Product<Double>(100.0);
//		Product<Object> obj = new Product<Object>(new Car());
		Car<?> car = new Car<Integer>(1000);
		Object obj = car.getPrice();
	}
}
