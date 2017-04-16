import java.util.ArrayList;

public class Game {

	private static Player[] players;
	private static Board board;
	private static Dice[] dices;
	private final static int startkapital = 500;
	static int anzahl;
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
			
			if(won(aktiverSpieler)){
				System.out.println("Sie haben gewonnen!!!!");
				break;
			}
			
			// 1. Würfeln

			System.out.println("Was wollen sie machen?");
			System.out.println("1. Würfeln");
			System.out.println("2. Karte spielen");
			
			int wuerfel = Dice.rollDice();
			
			 
			if(wuerfel == 0){
				players[aktiverSpieler].GoToPrison();
				System.out.println("Pasche gewürfelt ... ab ins Gefängnis");
			}
			
			if(aktuellesFeld == 10){
				boolean pasch = Dice.paschWuerfeln();
				if(!pasch) AktiverSpielerAendern();
				continue;
			}
			
			players[aktiverSpieler].setPosition(wuerfel);
			
			// Feldspezifisches Interact aufrufen
			board.getFields()[players[aktiverSpieler].getPosition()].interact(players[aktiverSpieler], 0);
			

			// ende --- aktiven Spieler bestimmen
			AktiverSpielerAendern();
		}

	}

	public static int getAnzahl() {
		return anzahl;
	}

	public static void setAnzahl(int anzahl) {
		Game.anzahl = anzahl;
	}

	public static int getAktiverSpieler() {
		return aktiverSpieler;
	}

	public static void setAktiverSpieler(int aktiverSpieler) {
		Game.aktiverSpieler = aktiverSpieler;
	}

	public static int getPasch() {
		return pasch;
	}

	public static void setPasch(int pasch) {
		Game.pasch = pasch;
	}

	public static int getStartkapital() {
		return startkapital;
	}

	public static void setAktuellesFeld(int aktuellesFeld) {
		Game.aktuellesFeld = aktuellesFeld;
	}

	public static int getAktuellesFeld() {
		return aktuellesFeld;
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

	public static Board getBoard() {
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

	public static boolean won(int aktuellerSpieler){
		
		for (int i = 0; i<players.length; i++) {
			if(i!=aktuellerSpieler)
				if(players[aktuellerSpieler].getBankBalance() >= 0)
					return false;
		}
		
		return true;
	}

}
