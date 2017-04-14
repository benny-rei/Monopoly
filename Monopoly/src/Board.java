
public class Board {
	
	public enum Type{};
	
	private Type type;
	private Field[] fields = new Field[40];
	
	
	
	public Board() {
		super();
		
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



	public void fillBoard(){
		
		fields[0] = new Go();
		
		int[] rent1 = {10,20,30,40};
		fields[1] = new Property("Mediteranian Avenue", 1, null, 40, rent1, false);
	
		fields[2] = new Action(null, "COMMUNITY CHEST", "lalalalallalalalalalalal");
		
		fields[3] = new Property("Baltic Avenue", 1, null, 40, rent1, false);
		
		fields[4] = new Action(null, "Income Tax", "pay 300 dollars");
		
		int[] rent0 = {20,30,40,50};
		fields[5] = new Property("Reading Railgroup", 0, null, 200, rent0, false);
	
		int[] rent2 = {20,30,40,50};
		fields[6] = new Property("Central Avenue", 2 , null, 100, rent2, false);
		
		fields[7] = new Action(null, "Chance", "?");
		
		fields[8] = new Property("Vermont Avenue", 2 , null, 100, rent2, false);
		fields[9] = new Property("Connectikut Avenue", 2 , null, 100, rent2, false);

		fields[10] = new Jail();
		
		int[] rent3 = {30,40,50,60};
		fields[11] = new Property("St. Charles Place", 3 , null, 140, rent3, false);
		
		fields[12] = new Action(null, "Electric Company", " Pay 150€");
		
		fields[13] = new Property("St. Aties Avenue", 3 , null, 140, rent3, false);
		fields[14] = new Property("Virgina Avenue", 3 , null, 140, rent3, false);

		fields[15] = new Property("Pensylvania Railroad", 0, null, 200, rent0, false);
		
		int[] rent4 = {40,50,60,70};
		fields[16] = new Property("St. James Place", 4 , null, 140, rent4, false);

		fields[17] = new Action(null, "Community Chest", "Follow Instructions of the Card");
		
		fields[18] = new Property("Tennesee Avenue", 4 , null, 180, rent4, false);
		fields[19] = new Property("New York Avenue", 4 , null, 200, rent4, false);

		fields[20] = new FreeParking();
		
		int[] rent5 = {40,50,60,70};
		fields[21] = new Property("Kentucky Avenue", 5 , null, 220, rent5, false);

		fields[22] = new Action(null, "Chance", "?");

		fields[23] = new Property("Indiana Avenue", 5 , null, 220, rent5, false);
		fields[24] = new Property("Illinois Avenue", 5 , null, 220, rent5, false);
		
		fields[25] = new Property("R and O Railroad", 0, null, 200, rent0, false);

		int[] rent6 = {50,60,70,80};
		fields[26] = new Property("Kentucky Avenue", 6 , null, 260, rent6, false);
		fields[27] = new Property("Atlantic Avenue", 6 , null, 260, rent6, false);

		fields[28] = new Action(null, "Water Works", " Pay 150€");

		fields[29] = new Property("Atlantic Avenue", 6 , null, 260, rent6, false);

		fields[30] = new GoToJail();
		
		int[] rent7 = {60,70,80,90};
		fields[31] = new Property("Pacific Avenue", 7 , null, 260, rent7, false);
		fields[32] = new Property("North Carolina Avenue", 7 , null, 260, rent7, false);

		fields[33] = new Action(null, "Community Chest", "Follow Instructions of the Card");

		fields[34] = new Property("Pensylvania Avenue", 7 , null, 260, rent7, false);

		fields[35] = new Property("Short line", 0, null, 200, rent0, false);

		fields[36] = new Action(null, "Chance", "?");
		
		int[] rent8 = {70,80,90,100};
		fields[37] = new Property("Pacific Avenue", 8 , null, 260, rent8, false);
		
		fields[38] = new Action(null, "Luxury Tax", "Pay 75 Dollars");
		
		fields[39] = new Property("Boardwalk", 8 , null, 400, rent8, false);


	}
	
}
