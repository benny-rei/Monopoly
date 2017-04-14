
public class Game {
	
	private Player[] players;
	private static Board board;
	private Dice[] dices;
	
	
	public static void main(String[] args) {	
		
		/**
		 * 1. player erstellen
		 * 2. board füllen
		 * 3. 
		 * 
		 */
		
		
		board = new Board();
		board.fillBoard();
		
	}
	
	
	

	public Player[] getPlayers() {
		return players;
	}





	public void setPlayers(Player[] players) {
		this.players = players;
	}





	public Board getBoard() {
		return board;
	}





	public void setBoard(Board board) {
		this.board = board;
	}





	public Dice[] getDices() {
		return dices;
	}





	public void setDices(Dice[] dices) {
		this.dices = dices;
	}





	public void start() {
		
	}
	
	public void move(Player player){
		
	}
	
}
