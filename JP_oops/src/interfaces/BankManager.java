package interfaces;

public class BankManager {
	public static void main(String[] args) {
		SBI s=new SBI();
		s.setAcno(100);
		s.setBal(10000);
		s.setName("Hemant Kumar");
		System.out.println(s.getAcno());
		s.withdrawal(10);
		SBI s1=new SBI();
		s1.deposite(10);
	}
}
