 package sampleswing;
abstract class Animal{
	private String name;
	public Animal(String name) {
		this.name=name;
		
	}
	public abstract void eat();
	public abstract void breathe();
	public String getName() {
		return name;
	
	}
}
class Racoon extends Animal{
	public Racoon (String name)
	{
	super (name);
	}
	public void eat()
	{
		System.out.println(getName()+" is eating");
	}
	public void breathe() {
		System.out.println("breathe in,breathe out,repeat");
	}
	}
	
	public class Abst {
		public static void main(String [] args)
		{
			Racoon recoon=new Racoon("Mr.Bean");
			recoon.eat();
			recoon.breathe();
			
		}

	}