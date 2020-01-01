package Thread;

public class Threadeg  extends Thread
{
	public static void main(String args[])
	{
		Threadeg t=new Threadeg();
		t.start();
	}
	public void run()
	{
		System.out.println("Am in run method by extending thread.");
	}

}
