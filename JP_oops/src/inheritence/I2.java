package inheritence;
class Parent
{
	Parent(int a)
	{
	
		System.out.println("Constructor of super class");
	}
}
class Child extends Parent
{
	Child()
	{
		super(10);
		System.out.println("Constructor of sub class");
	}
}
class I2 {
	public static void main(String[] args) {
		new Child();
	}
}
/*
o/p-
Constructor of super class
Constructor of sub class
*/