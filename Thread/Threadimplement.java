package Thread;

public class Threadimplement implements Runnable
{
	public static void main(String args[])
	{
		Threadimplement t=new Threadimplement();
		Thread t1=new Thread(t);
	
		t1.start();
	}
	public void run()
	{
		System.out.println("Am in run method by extending thread.");
	}

}



