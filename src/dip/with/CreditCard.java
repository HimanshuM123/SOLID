package dip.with;

public class CreditCard implements BankCard{
	
	public void doTransaction(long amt) {
		System.out.println("Paying using credit card amount "+amt);
	}

}
