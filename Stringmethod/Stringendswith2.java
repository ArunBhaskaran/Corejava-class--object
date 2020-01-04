package Stringmethod;

public class Stringendswith2 
{
	public static void main(String [] args)
	{
		String s="Welcome to FACE.in";
		System.out.println(s.endsWith("in"));//original string check.
		if(s.endsWith(".com"))//out of the string check.
		{
			System.out.println("String ends with .com");
		}
		else
		{
			System.out.println("It does not end with .com");
		}
	}

}
