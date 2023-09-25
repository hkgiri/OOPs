package polymorphism;
class A
{
	void testA()
	{
		System.out.println("Hi");
	}
	void testA(int i)
	{
		System.out.println(i);
	}
}
public class CTPM {
	public static void main(String[] args) {
		A a1=new A();
		a1.testA();
	}
}
//o/p-hi