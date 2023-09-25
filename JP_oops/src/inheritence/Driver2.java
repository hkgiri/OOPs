package inheritence;
class Account
{
	int acno;
	String name;
	String ifsc;
	
	Account(){}

	public Account(int acno, String name, String ifsc) {
		super();
		this.acno = acno;
		this.name = name;
		this.ifsc = ifsc;
	}
	public void display()
	{
		System.out.println("Account Number: "+acno);
		System.out.println("Account Holder's Name: "+name);
		System.out.println("Branch Code: "+ifsc);
    }
}
class SA extends Account
{
	double bal;
	SA(){}
	public SA(int acno, String name, String ifsc, double bal) {
		super(acno, name, ifsc);
		this.bal = bal;
	}
	public void display()
	{
		super.display();
		System.out.println("Account Balance: "+bal);
	}
}

public class Driver2 {
		public static void main(String[] args) {
			SA a1=new SA(101,"Hemant Kumar","PUNB101",45000);
			a1.display();
		}
}


