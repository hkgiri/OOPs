package interfaces;
//to achieve parent to parent inheritence..
class A1
{
}
interface B1
{
	
}
class c extends A1 implements B1
{
	
}

public class Driver {
	public static void main(String[] args) {
		A1 obj=new A1();
		B1 obj1=(B1)obj; // A1 type to B1 type.
		B1 obj2=null;
		A1 obj3=(A1)obj2; //B1 type to A1 type.
	}
}
