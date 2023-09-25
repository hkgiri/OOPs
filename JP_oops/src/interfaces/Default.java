package interfaces;
 //it is default modifier as keyword with help achieve method Overriding. 
interface Def {
	default void test()
	{
		System.out.println("Hi");
	}
	
}
class Default implements Def
{
	public void test()
	{
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		new Default().test();
	}
}
