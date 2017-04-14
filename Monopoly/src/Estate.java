
public class Estate extends Property {
	
	private int house_price;
	private int hotel_price;
	private int houese_amount;

	
	
	
	public Estate(String label, int group, Player owner, int value, int[] rents, boolean mortgage, int house_price,
			int hotel_price, int houese_amount) {
		super(label, group, owner, value, rents, mortgage);
		this.house_price = house_price;
		this.hotel_price = hotel_price;
		this.houese_amount = houese_amount;
	}

	


	public int getHouse_price() {
		return house_price;
	}




	public void setHouse_price(int house_price) {
		this.house_price = house_price;
	}




	public int getHotel_price() {
		return hotel_price;
	}




	public void setHotel_price(int hotel_price) {
		this.hotel_price = hotel_price;
	}




	public int getHouese_amount() {
		return houese_amount;
	}




	public void setHouese_amount(int houese_amount) {
		this.houese_amount = houese_amount;
	}




	@Override
	public void interact(Player player, Interaction interaction) {
		// TODO Auto-generated method stub
		
	}

}
