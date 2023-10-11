package dip.with;

public class ShoppingMall {

	//loosely coupled
	private BankCard bankCard;
	
	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doPurchaseSomething(long amt) {
		bankCard.doTransaction(amt);
	}
	
	public static void main(String[] args) {
		BankCard bankCard1 = (BankCard) new DebitCard();
		BankCard bankCard2 = (BankCard) new CreditCard();
		ShoppingMall shoppingMall1 = new ShoppingMall(bankCard1);
		ShoppingMall shoppingMall2 = new ShoppingMall(bankCard2);
		shoppingMall1.doPurchaseSomething(5000);
		shoppingMall2.doPurchaseSomething(3000);
	}
	
	//for credit card we need to change entire thing
}
