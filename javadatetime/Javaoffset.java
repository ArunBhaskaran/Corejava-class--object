package javadatetime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class Javaoffset 
{
	public static void main(String args[])
	{
		OffsetTime ot=OffsetTime.now();
		int h=ot.get(ChronoField.CLOCK_HOUR_OF_DAY);
		System.out.println(h);
		int m=ot.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(m);
		int s=ot.get(ChronoField.SECOND_OF_DAY);
		System.out.println(s);
		int h1=ot.getHour();
		System.out.println(h1+ " Hour");
		int m1=ot.getMinute();
		System.out.println(m1+ " Minute");
		int s1=ot.getSecond();
		System.out.println(s1+ " Second");
				
	}

}
