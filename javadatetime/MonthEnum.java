package javadatetime;
import java.time.*;
import java.time.temporal.*;
public class MonthEnum 
{
	public static void main(String args[])
	{
		Month m=Month.valueOf("January".toUpperCase());
		System.out.printf("month",m);
		LocalDate ld=Year.now().atMonth(m).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		Month m1=ld.getMonth();
		while(m1==m)
		{
			System.out.printf("%s%n", ld);
			ld=ld.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
			m1=ld.getMonth();
		}
		Month m2=Month.from(ld.now());
		System.out.println(m2.getValue());
		System.out.println(m2.name());
		System.out.println(m2.minus(2));
		System.out.println(m2.plus(2));
		System.out.println("Total days: "+m2.length(true));
	}

}
