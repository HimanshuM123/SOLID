package dip.without;

public class ShoppingMall {

	//tightly coupled
	private DebitCard debitCard;
	
	public ShoppingMall(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	
	public void doPurchaseSomething(long amt) {
		debitCard.doTransaction(amt);
	}
	
	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(debitCard);
		shoppingMall.doPurchaseSomething(5000);
	}
	
	//for credit card we need to change entire thing
}
