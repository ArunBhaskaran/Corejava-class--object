package Thread;

public class Daemon extends Thread 
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Deamon thread work");//checking for daemon thread
		}
		else
		{
			System.out.println("User thread work");
		}
	}
	public static void main(String args[])
	{
		Daemon t=new Daemon();//creating thread.
		Daemon t1=new Daemon();
		Daemon t2=new Daemon();
		
		t.setDaemon(true);//t is daemon thread.
		t.start();//starting thread.
		t1.start();
		t2.setDaemon(true);
		t2.start();
	}

}
