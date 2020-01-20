package javadateclassical;
import java.sql.Date;
public class Javasqldate
{
	public static void main(String arrgs[])
	{
		long l=System.currentTimeMillis();
		java.sql.Date d=new java.sql.Date(l);
		System.out.println(d);
		String s="2015-03-26";
		Date d1=Date.valueOf(s);
		System.out.println(d1);
		
	}

}
