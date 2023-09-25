package inheritence;
class P1
{
	void print()
	{
		System.out.println("HI DHONI");
	}
	int a=20;
	static int b=40; 
}

public class Driver1 extends P1 {

	public static void main(String[] args) {
		P1 obj=new P1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(Driver1.b);
		System.out.println(b);
		Driver1 obj1=new Driver1();
		obj1.test();
	}
	void test()
	{
		print();
		P1 obj=new P1();
	   obj.print();
	   super.print();
	   this.print();
	}
}
