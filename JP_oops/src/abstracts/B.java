package abstracts;
abstract class A
{
	void test()
	{
		System.out.println("From test()");
	}
	abstract void print();
}
public class B extends A {
	void print()
	{
		System.out.println("Implemantation inside class B");
	}
	public static void main(String[] args) {
		A obj=new B();
		obj.print();
		obj.test();
	}
}
