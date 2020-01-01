package Thread;
class MusicPlayer extends Thread
{
    public void run()
     {
    	for(int i=0;i<2;i++)
		System.out.println("Music is playing.");
     }
}
class MsWord implements Runnable
{
	public void run()
	{
		for(int i=0;i<2;i++)
		System.out.println("Typing Ms Word document.");
	}
}
public class Multithreadeg 
{
	public static void main(String args[])
	{
		MusicPlayer m=new MusicPlayer();
		Runnable r=new MsWord();
		Thread th=new Thread(r);
		m.start();
		th.start();
		
	}
}