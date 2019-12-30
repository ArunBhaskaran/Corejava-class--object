package Stringmethod;

public class Stringconcat
{
	public static void main (String args[])
	{
		String s="java string";
		s.concat("is immutable");//its not join the string because not create object. 
		System.out.println(s);	
		s=s.concat(" is immutable so assign it explicitly");//to create object so that strings are joined.
		System.out.println(s);
	}

}
