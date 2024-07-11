
public class ConstructorDemo {

	public static void main(String[] args) {
//		Car sonata = new Car();
//		System.out.println(sonata.name);
//		System.out.println(sonata.price);
//		product p = new Product(); -> 에러
		Product pencil =	new Product("모나미연필", 1000, "모나미社");
		Product computer = new Product("노트북", 20_000_000, "LG Gram");
		Product tv = new Product("텔레비전", 30_000_000, "삼성전자");
		
	}

}
