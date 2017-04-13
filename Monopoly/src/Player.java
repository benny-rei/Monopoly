import java.util.ArrayList;

public class Player {
	
	public enum Interaction{};
	
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





	public String getName() {
		return name;
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





	public void setPosition(int position) {
		this.position = position;
	}





	public ArrayList<ActionCard> getActionCards() {
		return actionCards;
	}





	public void setActionCards(ArrayList<ActionCard> actionCards) {
		this.actionCards = actionCards;
	}





	public ArrayList<Property> getProperty() {
		return property;
	}





	public void setProperty(ArrayList<Property> property) {
		this.property = property;
	}





	public void interact(Field field, Interaction interaction){
		
	}
	
}
