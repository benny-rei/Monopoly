import java.util.ArrayList;


public class Player {
	
	
	private String name;
	private int bankBalance;
	private int position;
	private ArrayList<ActionCard> actionCards;
	private ArrayList<Property> property;
	
	
	
	
	
	public Player(String name, int bankBalance, int position, ArrayList<ActionCard> actionCards,
			ArrayList<Property> property) {
		super();
		this.name = name;
		this.bankBalance = bankBalance;
		this.position = position;
		this.actionCards = actionCards;
		this.property = property;
	}

	
	public void addMoney(int amount){
		bankBalance += amount;
	}

	public void removeMoney(int amount){
		bankBalance -= amount;
	}

	public String getName() {
		return name;
	}


	public void removeCard(ActionCard card){
		actionCards.remove(card);
	}


	public void setName(String name) {
		this.name = name;
	}





	public int getBankBalance() {
		return bankBalance;
	}





	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}





	public int getPosition() {
		return position;
	}





	public void setPosition(int wuerfelZahl) {
		int positionAnfang = position;
		position = (position+wuerfelZahl)%40;
		if((positionAnfang+wuerfelZahl) > 40) addMoney(200);
		
	}


	public void GoToPrison(){
		this.position = 10;
	}


	public ArrayList<ActionCard> getActionCards() {
		return actionCards;
	}



	public void addActionCard(ActionCard card){
		actionCards.add(card);
	}

	
	public void KarteEntfernen(ActionCard card){
		actionCards.remove(card);
	}
	

	public ArrayList<Property> getProperty() {
		return property;
	}





	public void setProperty(ArrayList<Property> property) {
		this.property = property;
	}


}
