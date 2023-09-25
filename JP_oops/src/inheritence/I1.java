package inheritence;

public class I1 {
	int a=test();
	public static void main(String[] args) {
		System.out.println("From main");
		I1 obj=new I1();
		I1 obj1=new I1();
		System.out.println("main end");
	}
	public int test()
	{
		System.out.println("test begin");
		System.out.println("this "+this);
		System.out.println("a "+a);
		System.out.println("test end");
		return 30;
	}
}
