package polymorphism;
interface A2
{
	void testA();
}
class B2 implements A2
{
	public void testA()
	{
		System.out.println("Hi");
	}
}
class C2 implements A2
{
	public void testA()
	{
		System.out.println("Bye");
	}
}
class D2
{
	static void demo(A2 a1)
	{
		a1.testA();
	}
}
public class RTPM2 {
public static void main(String[] args) {
	A2 a1=new B2();
	D2.demo(a1);//Hi
	A2 a2=new C2();
	D2.demo(a2);//Bye
}
}
