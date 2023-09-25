package methodoverriding;
class Sheela{
	void dance()
	{
		System.out.println("Bharathanatyam");
	}
}
class Leela extends Sheela{
	void dance()
	{
		System.out.println("Salsa");
	}
}

public class Driver {
	public static void main(String[] args) {
		Sheela s1=new Sheela();
		s1.dance();
		Sheela s=new Leela();
		s.dance();
		Leela l=(Leela)s;
		l.dance();
	}
}
