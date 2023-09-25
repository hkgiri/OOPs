package interfaces;

public class SBI implements Bank{
	private static String name;
	private static double bal;
	private static int acno;
	
	public SBI() {}

	public void withdrawal(double amt) {
		if (bal>=amt) {
			System.out.println("Account Number Is: "+acno);
			System.out.println("Account Name Is: "+name);
			System.out.println("Account Balance: "+bal);
			System.out.println("Your Debit your Account is "+amt+" Rupess");
			bal=bal-amt;
			System.out.println("Your Account Balance is ");
			System.err.println(bal);
		}
		else  {
			System.out.println("Account Number Is: "+acno);
			System.out.println("Account Name Is: "+name);
			System.out.println("Account Balance: "+bal);
			System.err.println("Insufficient balance please check your balance");
		
			}
		
	}
	public void deposite(double amt) {
		
		if(amt>=1) {
			System.out.println("Account Number Is: "+acno);
			System.out.println("Account Name Is: "+name);
			System.out.println("Account Balance: "+bal);
			System.out.println("Your credit your Account is "+amt+" Rupess");
			bal=bal+amt;
			System.out.println("Your Account Balance Is ");
			System.err.println(bal);
		}
		else {
			System.out.println("Account Number Is: "+acno);
			System.out.println("Account Name Is: "+name);
			System.out.println("Account Balance: "+bal);
			System.err.println("please deposite valid Amount");
		}
	}


	public void loan(double amt) {
		if (amt>=1&&amt<=20000) {
			System.out.println("Account Number Is: "+acno);
			System.out.println("Account Name Is: "+name);
			System.out.println("Account Balance: "+bal);
			System.out.println("your Loan is Approve and Your Balance is credit Your Account.");
			System.out.println("please check Your Bank Account");
			bal=bal+amt;
			System.out.println("Your ROI is--> 5.5% "+"in yearly ");
			System.err.println("thanks");
		}
		else {
			System.out.println("Account Number Is: "+acno);
			System.out.println("Account Name Is: "+name);
			System.out.println("Account Balance: "+bal);
			System.err.println("Your Are Not Eligible for getting Loan");
			System.err.println("Thanks");
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}
	
	
}
