package javadateclassical;
import java.util.*;
public class Javatimezone
{
	public static void main(String args[])
	{
		String[] s=TimeZone.getAvailableIDs();
        System.out.println("In timezone Ids are :");
        for(int i=0;i<s.length;i++)
        {
        	System.out.println(s[i]);
        }
        TimeZone z=TimeZone.getTimeZone("Asia/Kolkata");
        System.out.println("The offset value of timeZone: "+z.getOffset(Calendar.ZONE_OFFSET));
        System.out.println("value is ID :" +z.getID());
        TimeZone zz=TimeZone.getDefault();
        String ss=zz.getDisplayName();
        System.out.println("Display name for default time zone: "+ss);
        	
	}

}
