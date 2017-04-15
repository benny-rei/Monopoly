
public class ActionCard extends Action{
	
	
	private Player owner;
	private boolean sofortZahlen;
	private int amountToPay, amountToGet;

	
	public ActionCard(String title, String text, Player owner, boolean sofortZahlen, int amountToPay, int amountToGet) {
		super(title, text);
		this.owner = owner;
		this.sofortZahlen = sofortZahlen;
		this.amountToPay = amountToPay;
		this.amountToGet = amountToGet;
	}


	public void PlayCard() {
		owner.removeMoney(amountToPay);
		owner.addMoney(amountToGet);
	}
	

	public boolean isSofortZahlen() {
		return sofortZahlen;
	}


	public void setSofortZahlen(boolean sofortZahlen) {
		this.sofortZahlen = sofortZahlen;
	}


	public int getAmountToPay() {
		return amountToPay;
	}


	public void setAmountToPay(int amountToPay) {
		this.amountToPay = amountToPay;
	}


	public int getAmountToGet() {
		return amountToGet;
	}


	public void setAmountToGet(int amountToGet) {
		this.amountToGet = amountToGet;
	}

	
	

}
