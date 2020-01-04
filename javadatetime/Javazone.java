package javadatetime;
import java.time.*;
public class Javazone
{
	public static void main(String args[])
	{
		ZonedDateTime zone=ZonedDateTime.parse("2020-01-03T10:00:10+05:30[Asia/Kolkata]");
		System.out.println((zone));
		LocalDateTime idt= LocalDateTime.of(2020, Month.JANUARY,03,10,26);
		ZoneId india=ZoneId.of("Asia/Kolkata");
		ZonedDateTime zon=ZonedDateTime.of(idt, india);
		System.out.println("In india central time zone: "+zon);
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		ZonedDateTime zon2=zon.withZoneSameInstant(tokyo);
		System.out.println("In tokyo central time zone:" +zon2);
		ZonedDateTime zon3=ZonedDateTime.now();
		System.out.println(zon3.getZone());
		ZonedDateTime m=zon3.minus(Period.ofDays(126));
		System.out.println(m);
		ZonedDateTime p=zon3.plus(Period.ofDays(126));
		System.out.println(p);
		
	}

}
