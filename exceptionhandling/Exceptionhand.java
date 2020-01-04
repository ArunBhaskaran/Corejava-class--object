package exceptionhandling;

public class Exceptionhand
{
	static void check()throws ArithmeticException
	{
		System.out.println("Inside check functoin");
		throw new ArithmeticException("Java package");
	}
	public static void main(String args[])
	{
		try
		{
			check();
		}
		catch (ArithmeticException e)
		{
			System.out.println("caught" + e);
		}
	}

}
