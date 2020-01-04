package javadatetime;
import java.time.OffsetDateTime;
public class Offsetdate 
{
	public static void main(String []args)
	{
		OffsetDateTime ofdt=OffsetDateTime.now();
		System.out.println(ofdt.getDayOfMonth());
		System.out.println(ofdt.getDayOfYear());
		System.out.println(ofdt.getDayOfWeek());
		System.out.println(ofdt.toLocalDate());
		OffsetDateTime v1=ofdt.minusDays(240);
		System.out.println(v1);
		OffsetDateTime v2=ofdt.plusDays(240);
		System.out.println(v2);
		
	}

}
