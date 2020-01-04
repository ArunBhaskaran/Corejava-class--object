package Stringmethod;

public class Multiconcat
{
	public static void main(String args[])
	{
		String s="hello";
		String s1="friends";
		String s2="hai";
		String s6="buddy";
		String s3=s.concat(s1);//single concat.
		System.out.println(s3);
		String s4=s.concat(s1).concat(s2).concat(s6);// multiple string concat.
		System.out.println(s4);
	}

}
