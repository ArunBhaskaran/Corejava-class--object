package sampleswing;
import java.util.Scanner;
public class objcls {
	String name;
	String age;
	String address;
	String email;
	int phno;

	public objcls(String name,String age,String address,String email,int phno)
	{
	this.name=name;
	this.address=address;
	this.email=email;
	this.phno=phno;
	}
	public void display() {
	System.out.println("\n<<<<<<<<< Information >>>>>>>>");
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
	System.out.println("Email:"+email);
	System.out.println("Contact Number:"+phno);
	}
	public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	System.out.println("Enter User Details");
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Enter the age");
	String age=s.next();
	System.out.println("Enter address");
	String address=s.next();
	System.out.println("Email");
	String email=s.next();
	System.out.println("Enter Phone Number");
	 int phno=s.nextInt();
	 objcls obj=new objcls(name,age,address,email,phno);
	 obj.display();
	 

	}
	}

