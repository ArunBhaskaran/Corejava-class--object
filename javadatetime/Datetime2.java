package javadatetime;
import java.time.*;
public class Datetime2 
{
	public static void main(String args[])
	{
		LocalDate lt=LocalDate.of(1997, Month.MARCH, 26);
		LocalDate lt1=LocalDate.of(2020, Month.FEBRUARY, 26);
		
		//number of days in month.
		System.out.println("Number of days:"+lt.getMonth()+":"+lt.lengthOfMonth());
		System.out.println("Number of days:"+lt1.getMonth()+":"+lt1.lengthOfMonth());
		
		//number of days in year.
		System.out.println("Number of days:"+lt.getYear()+":"+lt.lengthOfYear());
		System.out.println("Number of days:"+lt1.getYear()+":"+lt1.lengthOfYear());
		if(lt1.isLeapYear())
		{
			System.out.println(lt1.getYear()+" is a leap year.");
		}
		else
		{
			System.out.println(lt1.getYear()+" is not a leap year.");
		}
		if(lt.isLeapYear())
		{
			System.out.println(lt.getYear()+" is a leap year.");
		}
		else
		{
			System.out.println(lt.getYear()+" is not a leap year.");
		}
	}

}
