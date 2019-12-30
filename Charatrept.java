package Stringmethod;

public class Charatrept 
{
	public static void main(String args[])
	{
		String st="Welcome to PUBG mobile";
		int count=0;
		for(int i=0;i<st.length();i++)//length consider.
		{
			if(st.charAt(i)=='e')//to check the condition for char of repeat .
			{
				count++;
			}
		}
		System.out.println("Frequency of e is:- "+count);
	}

}
