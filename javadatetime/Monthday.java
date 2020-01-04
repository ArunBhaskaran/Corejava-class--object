package javadatetime;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class Monthday
{
	public static void main(String[] args)
	{
		MonthDay md=MonthDay.now();
		LocalDate ld=md.atYear(2020);
		System.out.println(ld);
		boolean a=md.isValidYear(2019);//local year and old year same or not.
		System.out.println(a);
		long b=md.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(b);
		ValueRange r=md.range(ChronoField.MONTH_OF_YEAR);//range of the month of year.
		System.out.println(r);
		ValueRange r1=md.range(ChronoField.DAY_OF_MONTH);//range of the day of month.
		System.out.println(r1);
	}

}
