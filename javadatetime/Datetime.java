package javadatetime;
import java.time.LocalDate;
import java.time.Month;
public class Datetime 
{
	public static void main(String args[])
	{
		LocalDate lt=LocalDate.now();
		System.out.println("Today's date :"+lt);
		LocalDate lt1=LocalDate.of(2020, Month.JANUARY,02);
		System.out.println(lt1);
		LocalDate lt2=LocalDate.of(1947, Month.JANUARY,26);
		System.out.println(lt2);
		System.out.println("Year : "+lt.getYear());
		System.out.println("Month : "+lt.getMonth().getValue());
		System.out.println("Day of month : "+lt.getDayOfMonth());
		System.out.println("Day of Week : "+lt.getDayOfWeek());
		System.out.println("Day of Year : "+lt.getDayOfYear());
		//plus method.
		System.out.println("Addition of days : "+lt.plusDays(5));
		System.out.println("Addition of months : "+lt.plusMonths(15));
		System.out.println("Addition of weeks : "+lt.plusMonths(45));
		System.out.println("Addition of Years : "+lt.plusMonths(5));
		//minus method.
		System.out.println("Subtraction of days : "+lt.minusDays(5));
		System.out.println("Subtraction of months : "+lt.minusMonths(15));
		System.out.println("Subtraction of weeks : "+lt.minusWeeks(45));
		System.out.println("Subtraction of Years : "+lt.minusYears(5));
		//isEqual().
		if(lt.isEqual(lt1))
		{
			System.out.println("both date are equal.");
		}
		else
		{
			System.out.println("both date are not equal.");
		}
		//ifAfter().
		if(lt1.isAfter(lt2))
		{
			System.out.println("date1 comes after date2");
		}
		//isBefore().
		if(lt2.isBefore(lt))
		{
			System.out.println("date2 comes before date");
		}
		
	}
}
