
public class Board {
	
	public enum Type{};
	
	private Type type;
	private Field[] fields = new Field[40];
	
	
	
	public Board(Type type, Field[] fields) {
		super();
		this.type = type;
		this.fields = fields;
	}

	

	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}



	public Field[] getFields() {
		return fields;
	}



	public void setFields(Field[] fields) {
		this.fields = fields;
	}



	public void fillBoards(){
		int[] rent0 = {10,20,30,40};
		fields[0] = new Property("Mediteranian Avenue", null, null, 40, rent0, false);
	
		fields[1] = new Action(null, "COMMUNITY CHEST", "lalalalallalalalalalalal");
		
		int[] rent1 = {10,20,30,40};
		fields[2] = new Property("Baltic Avenue", null, null, 40, rent1, false);
	
	
	}
	
}
