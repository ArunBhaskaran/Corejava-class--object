package sampleswing;

interface it {
	void method();
	void method1();
	void method2();
}
public class IntEg implements it
{
	public void method()
	{
		System.out.println("Hello");
	}
	public void method1()
	{
		System.out.println("Haii");
	}
	
	public void method2()
	{
		System.out.println("Hehehe...");
	}
	public static void main(String args[])
	{
		it t=new IntEg();
		t.method();
		t.method1();
		t.method2();
	}

}
