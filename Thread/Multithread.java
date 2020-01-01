package Thread;
class number extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("thread1 is running....."+i);
		}
	}
}
class number1 extends Thread
{
	public void run()
	{
		for(int i=10;i<20;i++)
		{
			System.out.println("thread2 is running....."+i);	
		}
	}
}
public class Multithread
{
	public static void main(String args[])
	{
	number t=new number();
	number1 t1=new number1();
	t.start();
	t1.start();
	}
}
