package sampleswing;

class stat {
	static int c=0;
	stat()
	{
		c++;
		System.out.println("number:-"+c);
	}
	public static void main(String args[])
	{
		stat s1=new stat();
		stat s2=new stat();
		stat s3=new stat();		
	}

}
