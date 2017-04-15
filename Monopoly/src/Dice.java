
public class Dice {
	
	public static int rollDice(){
		
		int wuerfel1 = 0, wuerfel2 = 0;
		
		wuerfel1 = (int) ((6*Math.random())+1);
		wuerfel2 = (int) ((6*Math.random())+1);
		
		if(wuerfel1 == wuerfel2)
			return 0;
		
		return (wuerfel1 + wuerfel2);
		
	}
	
}
