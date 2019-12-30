package Stringmethod;

public class Compareto 
{
	public static void main(String args[])
	{
		String s="hello";
		String s1="hello";
		String s2="meklo";
		String s3="hemlo";
		String s4="flag";
		System.out.println(s.compareTo(s1));//both string are same get 0.
		System.out.println(s.compareTo(s2));//check "h"&"m" is lower than -5 times.
		System.out.println(s.compareTo(s3));//"l"&"m" is lower than -1 times.
		System.out.println(s.compareTo(s4));//"h"&"f" is upper than 2 times.
		
	}

}
