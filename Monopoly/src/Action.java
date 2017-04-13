
public class Action extends Field {

	public enum ActionCardType{};
	
	ActionCardType type;
	String title;
	String text;
	
	
	
	public Action(ActionCardType type, String title, String text) {
		super();
		this.type = type;
		this.title = title;
		this.text = text;
	}



	@Override
	public void interact(Player player, Interaction interaction) {
		// TODO Auto-generated method stub
		
	}

}
