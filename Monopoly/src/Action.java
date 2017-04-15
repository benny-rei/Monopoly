import java.util.ArrayList;

public class Action extends Field {

	String title;
	String text;
	ArrayList<ActionCard> cardList;
	
	
	public Action(String title, String text) {
		super();
		this.title = title;
		this.text = text;
	}

	public void KartenErstellen() {
		cardList.add(new ActionCard("Kredithai", "Zahle dem Kreditunternehmen 500 dollar", null, true, 500, 0));
	}
	
	// oberste Karte zurückgeben
	public ActionCard LetzteKarte(){
		return cardList.get(cardList.size());
	
	}

	
	@Override
	public void interact(Player player, int wuerfelZahl) {
		
		ActionCard karte = LetzteKarte();
				
		if(karte.isSofortZahlen()) player.removeMoney(karte.getAmountToPay());
		else player.addActionCard(karte);
		
		
	}

}
