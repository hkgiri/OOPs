package abstracts;
abstract class Lap
{
	int pid;
	String ram;
	double price;
	abstract public void display(); 
}
 class Laptop extends Lap {
	 Laptop(){}
	 Laptop(int pid,String ram,double price)
	 {
		 this.pid=pid;
		 this.ram=ram;
		 this.price=price;
	 }
	 public void display()
	 {
		 System.out.println("Product Id: "+pid);
		 System.out.println("Ram Of The Laptop Is: "+ram);
		 System.out.println("Price Of The Laptop Is: "+price);
	 }
	
}
class LaptopDriver
{
	public static void main(String[] args) {
		Lap l1=new Laptop(101,"4GB",49999);
		l1.display();
		Lap l2=new Laptop(102,"8GB",69999);
		l2.display();
	}
	
}

