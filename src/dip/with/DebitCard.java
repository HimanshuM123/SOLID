package dip.with;

public class DebitCard implements BankCard{
	public void doTransaction(long amt) {
		System.out.println("Paying using debit card amount "+amt);
	}
}
