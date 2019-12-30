package Stringmethod;
import java.util.ArrayList;
public class Stringequals1 
{
	public static void main(String []agrs)
	{
		String s="FACENXT";
		ArrayList<String> list=new ArrayList<>();
	    list.add("FACE");
	    list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		for(String s1:list)
		{
			if(s1.contentEquals(s))
			{
				System.out.println("FACENXT is present");
			
			}
		}

	}


}
