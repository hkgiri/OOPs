package polymorphism;
class A1
{
	void testA()
	{
		System.out.println("Hi");
	}
}
class B1 extends A1
{
	void testA()
	{
		System.out.println("Bye");
	}
}
class C
{
	static void demo(A1 a1)
	{
		a1.testA();
	}
}

public class RTPM1 {
	public static void main(String[] args) {
		A1 a1=new B1();
		C.demo(a1);//Bye
		A1 a2=new A1();
		C.demo(a1);//Bye
		B1 b1=(B1)a1;
		C.demo(b1);//Bye
		
	}
}
