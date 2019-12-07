package sampleswing;
public class Inn 
{
	private int a=2018;
	class inner
	
	{
		public void fun()
		{
			System.out.println("Welcome to Pubg Mobile "+a);
		}
	}
	public static void main(String [] args)
	{
		Inn i=new Inn();
		Inn.inner in=i.new inner();
		in.fun();
	}
}