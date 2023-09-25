package polymorphism;
class Sheela
{
	void dance()
	{
		System.out.println("Bharathanatyam");
	}
}
class Leela extends Sheela
{
	void dance()
	{
		System.out.println("Salsa");
	}
	
}
class Driver {
	public static void main(String[] args) {
		Sheela s=new Leela();//upcasting
		s.dance();
		Leela l=(Leela)s;//downcasting
		l.dance();		
	}
}
/*
Salsa
Salsa
*/
