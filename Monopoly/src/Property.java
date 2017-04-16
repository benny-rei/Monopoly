import java.util.Scanner;

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
	public void interact(Player player, int wuerfelZahl) {
		
		int feld = Game.getAktuellesFeld();
		Scanner scanner = new Scanner(System.in);
		
		// überprüfen ob alle Gebäude der gleichen Farbe im Besitz des aktuellen Spielers sind
		if(Game.getBoard().getFields()[feld].getHouseAmount() == 0){
			System.out.println("Dieses Feld is leer, wollen Sie es kaufen? [j,n]");
			String answer = scanner.nextLine();
			if(answer.toLowerCase().equals("j")){
				Game.getBoard().getFields()[feld].addHouseAmount();
			}
		}else if (!Game.getBoard().getFields()[feld].getOwner().equals(player)) {
			Game.getBoard().getFields()[feld].getOwner().addMoney(Game.getBoard().getFields()[feld].getRent());
			System.out.println("Sie müssen "+Game.getBoard().getFields()[feld].getRent()+" an "+Game.getBoard().getFields()[feld].getOwner().getName()+" zahlen");
		}else{
			boolean besitztAlle = true;
			for(int i = 0; i<=40; i++) {
				if(Game.getBoard().getFields()[feld].getGroup() == this.group){
					if(Game.getBoard().getFields()[feld].getOwner().equals(player)){
						besitztAlle=false;
						break;
					}
					
				}
			}
			Game.getBoard().getFields()[feld].addHouseAmount();
			System.out.println("das Haus wurde gekauft");
			
		}
		
				
		
	}
	
}
