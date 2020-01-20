package javadateclassical;
import java.util.Calendar;
public class Javacalender 
{
	public static void main(String args[])
	{
		Calendar c=Calendar.getInstance();
		System.out.println("The current date is : " +c.getTime());
		c.add(Calendar.DATE, -15);
		System.out.println("15 days ago : " +c.getTime());
		c.add(Calendar.MONTH, 3);
		System.out.println("3 months later : " +c.getTime());
		c.add(Calendar.YEAR, 2);
		System.out.println("2 years later : " +c.getTime());
		System.out.println("At present year:"+c.get(Calendar.YEAR));
		System.out.println("At present day:"+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("At present time:"+c.getTime());
		int m=c.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum number of days:"+m);
		m=c.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum number of weeks:"+m);
		int n=c.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Minimum number of days:"+n);
		n=c.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("Minimum number of weeks:"+n);
    }

}
