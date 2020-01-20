package javadateclassical;
import java.util.*;
public class Javautildate
{
	public static void main(String args[])
	{
		Date d=new Date();
		System.out.println("System date :" +d.toString());
		d.setTime(15680);
		System.out.println("Time after setting :" +d.toString()); 
		int a=d.hashCode();
		System.out.println("Amount (in ms) by time is shifted :" +a);
		Date d1=new Date(2020,01,07);
		Date d2=new Date(2019,12,25);
		boolean b=d2.after(d1);
		System.out.println("Is date2 is after date1 :"+b);
		b=d1.after(d2);
		System.out.println("Is date1 is after date2 :"+b);
		System.out.println("");
		Object d3=d1.clone();
		System.out.println("Cloned date3 :" +d3.toString());
		System.out.println("");
		boolean c=d2.before(d1);
		System.out.println("Is date2 is before date1 :" +c);
		Date dd=new Date(97,10,27);
		Date dd1=new Date(97,3,26);
		int comparison=dd.compareTo(dd1);
		int comparison1=dd1.compareTo(dd);
		int comparison2=dd.compareTo(dd);
		System.out.println("dd > dd :" +comparison);
		System.out.println("dd < dd :" +comparison1);
		System.out.println("dd = dd :" +comparison2);
		System.out.println("");
		boolean r=dd.equals(dd1);
		System.out.println("result of equal() r :"+r);
		boolean r1=dd.equals(dd);
		System.out.println("result of equal() r1 :"+r1);
		long l=dd.getTime();
		long l1=dd.getTime();
		System.out.println("Millisec of dd :" +l);
		System.out.println("Millisec of dd1 :" +l1);
			
	}

}
