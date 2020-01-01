package Thread;
class Music extends Thread
{
   public void run()
   { 
	   try
	   {
		   System.out.println("Music Playing...");
			Thread.sleep(10000);  
	   }
	   catch(InterruptedException e)
	   {
		 System.out.println("Whatsapp msg is here..."); 
	   }
	
    }
  public static void main(String args[])
	{
		Music m=new Music();
		m.start();
		m.interrupt();		
	}
}


