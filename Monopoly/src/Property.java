
public class Property extends Field {

	public enum Group {};
	
	private String label;
	private Group group;
	private Player owner;
	private int value;
	private int[] rents;
	private boolean mortgage;
	
	
	@Override
	public void interact(Player player, Interaction interaction) {
		// TODO Auto-generated method stub
		
	}
	
}
