
public class Property extends Field {

	
	private String label;
	// 0 für Flughafen
	private int group;
	private Player owner;
	private int value;
	private int[] rents;
	private boolean mortgage;
	
	
	
	
	public Property(String label, int group, Player owner, int value, int[] rents, boolean mortgage) {
		this.label = label;
		this.group = group;
		this.owner = owner;
		this.value = value;
		this.rents = rents;
		this.mortgage = mortgage;
	}




	public String getLabel() {
		return label;
	}




	public void setLabel(String label) {
		this.label = label;
	}




	public int getGroup() {
		return group;
	}




	public void setGroup(int group) {
		this.group = group;
	}




	public Player getOwner() {
		return owner;
	}




	public void setOwner(Player owner) {
		this.owner = owner;
	}




	public int getValue() {
		return value;
	}




	public void setValue(int value) {
		this.value = value;
	}




	public int[] getRents() {
		return rents;
	}




	public void setRents(int[] rents) {
		this.rents = rents;
	}




	public boolean isMortgage() {
		return mortgage;
	}




	public void setMortgage(boolean mortgage) {
		this.mortgage = mortgage;
	}




	@Override
	public void interact(Player player, Interaction interaction) {
		// TODO Auto-generated method stub
		
	}
	
}
