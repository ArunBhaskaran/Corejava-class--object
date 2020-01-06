package javadatetime;
import java.time.*;
import java.time.chrono.*;
import java.time.temporal.*;
public class Javazoneoffset
{
	public static void main(String args[])
	{
		ZoneOffset of=ZoneOffset.UTC;
		Temporal tt=of.adjustInto(ZonedDateTime.now());
		System.out.println(tt);
		ZoneOffset of1=ZoneOffset.ofHours(5);
		System.out.println(of1);
		ZoneOffset of2=ZoneOffset.ofHoursMinutes(5,30);
		System.out.println(of2);
		boolean b1=of.isSupported(ChronoField.OFFSET_SECONDS);
		System.out.println(b1);
		boolean b2=of.isSupported(ChronoField.SECOND_OF_MINUTE);
		System.out.println(b2);
	}

}
