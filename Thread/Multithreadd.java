package Thread;
class numbers implements Runnable
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
			
		}
	}
}
public class Multithreadd 
{
	public static void main(String args[])
	{
		Runnable ob=new numbers();
		numbers ob1=new numbers();
		Thread t=new Thread(ob);
		Thread f=new Thread(ob1);
		t.start();
		f.start();
	}
}
