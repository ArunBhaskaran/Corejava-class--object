package sampleswing;
import java.util.Scanner;
public class Objclss {
	
	String name;
	String age;
	String address;
	String email;
	int phno;
	public static void main(String[] args) {

  Objclss obj=new Objclss();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter User Details");
	System.out.println("Enter  user name");
	obj.name=s.next();
	System.out.println("Enter the Age");
	obj.age=s.next();
	System.out.println("Enter address");
	obj.address=s.next();
	System.out.println("Enter email");
	obj.email=s.next();
	System.out.println("Enter Phone Number");
	 obj.phno=s.nextInt();
	System.out.println("\n<<<<<<<< User Details >>>>>>>");
	System.out.println("Name:"+obj.name);
	System.out.println("Age:"+obj.age);
	System.out.println("Address:"+obj.address);
	System.out.println("Email:"+obj.email);
	System.out.println("Contact Number:"+obj.phno);
	 
	       

	}

	}


