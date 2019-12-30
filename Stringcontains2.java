package Stringmethod;

public class Stringcontains2
{
	public static void main(String args[])
	{
		String s="Hello F#A#C#E@2.0 readers";
		boolean isContains=s.contains("F#A#C#E");
		System.out.println(isContains);//case sensitive.
		System.out.println(s.contains("FACe"));
	}

}
