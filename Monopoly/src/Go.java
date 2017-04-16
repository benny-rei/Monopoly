
public class Go extends Field {

	
	
	public Go() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public void interact(Player player, int wuerfelZahl) {

		player.addMoney(400);
		System.out.println("Sie stehen auf dem Los Feld. Sie bekommen 400€");
	}

}
