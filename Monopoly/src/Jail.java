import java.util.ArrayList;

public class Jail extends Field {
	

	private ArrayList<Player> prisoners;

	
	
	public Jail() {
		super();
	}

	
/*
	public ArrayList<Player> getPrisoners() {
		return prisoners;
	}

	public void addPrisoner(Player prisoner) {
		this.prisoners.add(prisoner);
	}
	
	public void removePrisoner(Player prisoner){
		this.prisoners.remove(prisoner);
	}
*/

	@Override
	public void interact(Player player, int wuerfelZahl) {
		
		System.out.println("Du bist jetzt im Gefängnis");
	}

	
}
