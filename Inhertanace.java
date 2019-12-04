package sampleswing;
import java.util.*;
class java
{
	public void oops(int a,int b)
			
	{
	System.out.println(a+b);
	}
}
public class Inhertanace extends java
{
	public void calu(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void main(String [] args)
	{
	Inhertanace ja=new Inhertanace();
	ja.oops(10,20);
	ja.calu(5,6);
		
	}
	
}
