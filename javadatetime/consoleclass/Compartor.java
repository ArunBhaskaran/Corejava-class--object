package consoleclass;
import java.util.*;
public class Compartor
{
	public static void main(String []args)
	{
		int n,age;
		String name;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		List<Empolyee> list=new LinkedList<Empolyee>();
		Empolyee[] emp=new Empolyee[n];
		for(int i=0;i<n;i++)
		{
			name=s.next();
			age=s.nextInt();
			emp[i]=new Empolyee();
			emp[i].setAge(age);
			emp[i].setName(name);
			list.add(emp[i]);
		}
		System.out.println("Name wise Comparison ");
		Collections.sort(list,new NameComparator());
		for(Empolyee e:list)
			System.out.println(e.getName()+" : "+e.getAge());
				System.out.println("Age wise comparison ");
				Collections.sort(list,new AgeComparator());
				for(Empolyee e:list)
					System.out.println(e.getName()+" : "+e.getAge());
				s.close();
	}
}
class AgeComparator implements Comparator
{
	
	public int compare(Object o1,Object o2)
	{
		Empolyee e1=(Empolyee)o1;
		Empolyee e2=(Empolyee)o2;
		if(e1.getAge()==e2.getAge())
		{
			return 0;
		}
		else if(e1.getAge()>e2.getAge())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
}
class NameComparator implements Comparator<Empolyee>
{
	public int compare(Empolyee o1,Empolyee o2)
	{
		Empolyee e1=(Empolyee)o1;
		Empolyee e2=(Empolyee)o2;
		return e1.getName().compareTo(e2.getName());
		
	}
}