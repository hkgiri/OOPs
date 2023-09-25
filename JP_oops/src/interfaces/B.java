package interfaces;
interface A
{
	static int a=10;
}
public class B implements A {
	public static void main(String[] args) {
		System.out.println("From Class main");
		System.out.println(a);
	}
}
