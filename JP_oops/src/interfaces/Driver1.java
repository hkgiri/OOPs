package interfaces;
class Lokeshwari
{
	void smile()
	{
		System.out.println("Throw a smile");
	}
}
class Prasanth
{
	Lokeshwari add1()
	{
		return new Lokeshwari();
	}
}
class Dingi
{
	Prasanth add2()
	{
	return new Prasanth();
	}
}
class Leela
{
	Dingi add3()
	{
		return new Dingi();
	}
}
class Shiva
{
	Leela add4()
	{
		return new Leela();
	}
}
class Lokesh
{
	Shiva remember()
	{
		return new Shiva();
				
	}
}

public class Driver1 {
	public static void main(String[] args) {
		Lokesh l=new Lokesh();
		//step 1
		/*Shiva s=l.remember();
		Leela le=s.add4();
		Dingi d=le.add3();
		Prasanth p=d.add2();
		Lokeshwari lok = p.add1();
		lok.smile();*/
		
		//step 2
		l.remember().add4().add3().add2().add1().smile();
		
		
	}
}
