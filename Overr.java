package sampleswing;


 class shape
{
	
	
		
	public void friend()
	{
		System.out.println("Chekkuzzz");
	}
	}
	class shapea extends shape
	{
	public void friend()
	{
		System.out.println("Bobby");
	}
	}
	class shapeb extends shape
	{
	public void friend()
	{
		System.out.println("Vj");
	}
	}
	class shapec extends shape
	{
	public void friend() 
	{
		
		System.out.println("Kappiyar");
	}
	}
	public class Overr
	{
		public static void main(String[] args)
		{
		shape ov=new shape();
		shape ov1=new shapea();
		shape ov2=new shapeb();
		shape ov3=new shapec();
		

		ov.friend();
		ov1.friend();
		ov2.friend();
		ov3.friend();
		}

	}


