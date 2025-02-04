import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		String [] array = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
//		Set<String> set = new HashSet<String>();
//		for(String element : array) set.add(element);
//		
//		//bulk로 데이터를 추출하고자 할 때, Enumeration, Iterator
//		Iterator<String> iters = set.iterator();
//		while(iters.hasNext()) {
//			System.out.print(iters.next() + ",");
//		}
		List<String> vector = new Vector<String>();
		for(String element : array) vector.add(element);
		Enumeration<String> enums = ((Vector<String>) vector).elements();
		while(enums.hasMoreElements()) {
			System.out.println(enums.nextElement() + ", ");
		}
	}
}
