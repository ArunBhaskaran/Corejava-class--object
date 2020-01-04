package javadatetime;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Datetime3
{
	public static void main(String args[])
	{
		
		//ISO date.
		LocalDate lt=LocalDate.now();
		DateTimeFormatter df=DateTimeFormatter.ISO_DATE;
		System.out.println(lt.format(df));
		
		//pattern yyyy/MM/dd.
		DateTimeFormatter dt1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(lt.format(dt1));
		
		//pattern MM/dd/yyyy.
		DateTimeFormatter dt2=DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
		System.out.println(lt.format(dt2));
		
		//pattern dd/MM/yyyy.
		DateTimeFormatter dt3=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(lt.format(dt3));
		
		//dd/LL/yyyy.
		DateTimeFormatter dt4=DateTimeFormatter.ofPattern("dd/LL/yyyy");
		System.out.println(lt.format(dt4));
		
	}

}
