import java.io.IOException;
import java.io.InputStream;

public class IODemo {

	public static void main(String[] args) {
		System.out.println("글자 한 개를 입력하세요 : ");
		InputStream is = System.in;
		try {
			code = is.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("co de = " + code);

	}

}
