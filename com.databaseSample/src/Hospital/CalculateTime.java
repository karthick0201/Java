package Hospital;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CalculateTime {

	public static void main(String[] args) {
		String time1 = "16:23:00";
		String time2 = "19:00:00";

		try {
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date date1 = format.parse(time1);
			Date date2 = format.parse(time2);
			long diff = date2.getTime() - date1.getTime();
			System.out.println(diff);

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");
			
			//String d=(String)date1;
			System.out.println("Calculate : "+date1);

		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

}
