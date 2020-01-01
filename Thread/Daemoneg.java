package Thread;

public class Daemoneg extends Thread
{
	public void run()
	{
		System.out.println("Thread name:"+Thread.currentThread().getName());
		System.out.println("Check if its DaemonThread:"+Thread.currentThread().isDaemon());
	}
	public static void main(String args[])
	{
		Daemoneg t=new Daemoneg();
		Daemoneg t1=new Daemoneg();
		t.start();//exception thread is started.
		t.setDaemon(true);
		t1.start();
	}

}
