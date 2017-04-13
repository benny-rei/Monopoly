
public class Game {
	
	private Player[] players;
	private Board board;
	private Dice[] dices;
	
	
	
	public Game(Player[] players, Board board, Dice[] dices) {
		super();
		this.players = players;
		this.board = board;
		this.dices = dices;
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
