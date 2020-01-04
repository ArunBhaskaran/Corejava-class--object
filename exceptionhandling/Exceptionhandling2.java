package exceptionhandling;
class test extends Exception
{
}
public class Exceptionhandling2
{
	public static void main(String args[])
	{
		try
		{
			throw new test();
		}
		catch(test t)
		{
			System.out.println("got the test exception");
		}
		finally
		{
			System.out.println("Inside final block ");
		}
		
	}

}
