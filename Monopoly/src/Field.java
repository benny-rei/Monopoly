
public abstract class Field {
	
	int houseAmount = 0;
	Player owner;
	int rent;
	int group;
	
	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public void interact(Player player, int wuerfelSumme) {
	}

	public void addHouseAmount() {
		if(houseAmount<=5){
			owner.removeMoney(rent);
			houseAmount++;
			
		}
	}

	public int getHouseAmount() {
		return houseAmount;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	

	
	
}
