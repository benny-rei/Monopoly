import java.util.ArrayList;

public class Jail extends Field {

	private ArrayList<Player> prisoners;

	
	
	public Jail(ArrayList<Player> prisoners) {
		super();
		this.prisoners = prisoners;
	}

	

	public ArrayList<Player> getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(ArrayList<Player> prisoners) {
		this.prisoners = prisoners;
	}



	@Override
	public void interact(Player player, Interaction interaction) {
		// TODO Auto-generated method stub
		
	}

}
