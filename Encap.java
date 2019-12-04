package sampleswing;
import java.util.Scanner;
public class Encap {
	public static void main(String [] args)
	{
		Enca1 en=new Enca1();
		Scanner s=new Scanner(System.in);
		
		System.out.println("DATAS");
		System.out.println("Name:");
		String Name=s.next();
		en.setName(Name);
		System.out.println("DOB:");
		String DOB=s.next();
		en.setDOB(DOB);
		System.out.println("Special:");
		String Special=s.next();
		en.setSpecial(Special);
		System.out.println("Awards:");
		String Awards=s.next();
		en.setAwards(Awards);
	
		System.out.println("<<<<<<<<<<<<Profile>>>>>>>>>>>>");
		System.out.println("Name:"+en.getName());
		System.out.println("DOB:"+en.getDOB());
		System.out.println("Special:"+en.getSpecial());
		System.out.println("Awards:"+en.getAwards());
	}

}