import java.util.ArrayList;

public class Game {

	private static Player[] players;
	private static Board board;
	private static Dice[] dices;
	private final static int startkapital = 500;
	private static int anzahl;
	private static int aktiverSpieler;
	private static int aktuellesFeld;

	private static int pasch = 0;

	public static void main(String[] args) {

		/**
		 * 1. player erstellen 2. board füllen 3.
		 * 
		 */

		// anzahl der Spieler festlegen
		anzahl = 2;
		aktiverSpieler = 0;

		players = new Player[2];

		players[0] = new Player("Bennsch", startkapital, 0, null, null);
		players[1] = new Player("Berglo", startkapital, 0, null, null);

		board = new Board();
		board.fillBoard();
		
		aktuellesFeld = 0;

		while (true) {

			// ---- Menü ------

			// 1. Würfeln

			int wuerfel = Dice.rollDice();
			
			// TODO:
			// wenn im Gefängnis
			// dann ....
			// 
			// wenn über go dann
			//
			//
			 
			if(wuerfel == 0){
				players[aktiverSpieler].GoToPrison();
				System.out.println("Pasche gewürfelt ... ab ins Gefängnis");
			}
			
			if(aktuellesFeld == 10){
				
			}
			
			// Feldspezifisches Interact aufrufen
			board.getFields()[players[aktiverSpieler].getPosition()].interact(players[aktiverSpieler], 0);
			

			// ende --- aktiven Spieler bestimmen
			AktiverSpielerAendern();
		}

	}

	public static void AktiverSpielerAendern() {
		if (aktiverSpieler < (anzahl - 1))
			aktiverSpieler++;
		else
			aktiverSpieler = 0;
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

	public void move(Player player) {

	}

}
