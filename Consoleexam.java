package consoleclass;
import java.io.Console;
public class Consoleexam 
{
		public static void main(String args[])
		{
		String s;
		Console con=System.console();
		if(con==null)
		{
			System.out.println("no console available");
			return;
		}
		s=con.readLine("enter the name: ");
		System.out.print(s);
		System.out.println("enter the password: ");
		char[] ch=con.readPassword();
		String pass=String.copyValueOf(ch);
		System.out.println("Password is:" +pass);
		}

	}






