package Stringmethod;

public class Compareempty 
{
	public static void main(String args[])
	{
		String s="hello";
		String s1="";
		String s2="me";
		System.out.println(s.compareTo(s1));//2nd string is null,so we get the value of 1st string of length.
		System.out.println(s1.compareTo(s2));//1st string is null,so we get the value of 2nd string of length but its negative.
		
	}

}
