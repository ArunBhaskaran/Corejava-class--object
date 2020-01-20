package consoleclass;
import java.util.*;
public class Emplyeecompar 
{

	public static void main(String args[])
	{
	int i,n;
	String name;
	int age;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	TreeSet<Empolyee> aa=new TreeSet<Empolyee>();
	Empolyee[] emp=new Empolyee[n];
	for(i=0;i<n;i++)
	{
		 name=s.next();
		 age=s.nextInt();
		 emp[i]=new Empolyee();
		 emp[i].setAge(age);
		 emp[i].setName(name);
		 aa.add(emp[i]);
		 
	}
	for(Empolyee e:aa)
		System.out.println(e.getName()+" = "+e.getAge());
	s.close();
	}
}


 class Empolyee implements Comparable<Empolyee>
{
	
	private String name;
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	@Override
	public int compareTo(Empolyee e) 
	{
		if(age<e.getAge())
		{
		return 1;
		}
		else if(age>e.getAge()) 
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}



	