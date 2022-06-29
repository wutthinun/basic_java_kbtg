import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println("============================");

		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			d = df.parse("2022-01-01 13:45:27");
			System.out.println(d);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		System.out.println("============================");

		Calendar c = Calendar.getInstance();
		c.setTime(d);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}
}
