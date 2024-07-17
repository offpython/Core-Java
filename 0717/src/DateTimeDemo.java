import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class DateTimeDemo {
	public static void main(String[] args) {
//		Date now = new Date();
//		System.out.println(now); 	//noew.toString
//		Calendar cal = new Calendar();
		
//		Calendar cal = Calendar.getInstance();
//		System.out.printf("오늘은 %d년 %d월 %d일 입니다. %n",
//				cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, 
//				//cal.get(Calendar.DATE) );
//				cal.get(Calendar.DAY_OF_MONTH));
		
//		Calendar cal = new GregorianCalendar(2024, 11, 25);
//		System.out.printf("금년은 %d년 %n", cal.get(Calendar.YEAR));

//		DateFormat df = DateFormat.getDateTimeInstance(
//					DateFormat.FULL, DateFormat.MEDIUM, Locale.FRENCH);
//		System.out.println(df.format(new Date()));
		
//		String patter = "오늘은 yyyy년 MM월 dd일입니다.";
//		DateFormat df =new SimpleDateFormat(patter);
//		System.out.println(df.format(new Date()));
		
		String pattern = String.format("오늘은 %1$tY년 %1$tm월 %1$td일 입니당~", new Date());
		System.out.println(pattern);
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니당~", new Date());
	}
}
