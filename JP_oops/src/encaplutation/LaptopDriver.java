package encaplutation;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop lap1=new Laptop(100,"Apple NoteBook Pro",182000);
		System.out.println(lap1);
		Laptop lap=new Laptop();
		lap.setLid(101);
		int id = lap.getLid();
		System.out.println(id);
		
	}
}
