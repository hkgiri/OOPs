package encaplutation;

public class Laptop {
	private int lid;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid=lid;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	Laptop(){}
	public Laptop(int lid, String name, double price) {
		super();
		this.lid = lid;
		this.name = name;
		this.price = price;
	}
	public void LapDisplay() {
		System.out.println("Laptop Details");
		System.out.println("Laptop Id: "+lid);
		System.out.println("Laptop Name: "+name);
		System.out.println("Laptop price: "+price);
		System.out.println("*********************");
		
	}
	public String toString() {
		System.out.println("Laptop Details");
		System.out.println("Laptop Id: "+lid);
		System.out.println("Laptop Name: "+name);
		System.out.println("Laptop price: "+price);
		System.out.println("*********************");
		return"";
	}
	
	
	
	
	
	
	
}
