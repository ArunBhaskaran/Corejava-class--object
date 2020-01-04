package Stringmethod;

public class Concatsplchar
{
	public static void main(String args[])
	{
		String s="hello";
		String s1="hai";
		String s2="friends";
		String s3=s.concat(" ").concat(s1).concat(" ").concat(s2);//multiple string join and space allocation.
		System.out.println(s3);
		String s4=s.concat("!!!");//to join the special characters in string.
		System.out.println(s4);
		String s5=s1.concat("@");
		System.out.println(s5);
		
	}

}
