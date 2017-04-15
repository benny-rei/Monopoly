
public class Dice {
	
	public static int rollDice(){
		
		int zahl = 0;
		boolean pasch = true;
		boolean out = false;
		
		int schleifenZaehler = 0;
		while((schleifenZaehler < 3) && (pasch)){
			int wuerfel1 = 0, wuerfel2 = 0;
			
			wuerfel1 = (int) ((6*Math.random())+1);
			wuerfel2 = (int) ((6*Math.random())+1);
			
			if(wuerfel1 == wuerfel2) pasch=true; else pasch=false;
			
			zahl += (wuerfel1 + wuerfel2);
			
			
			schleifenZaehler++;
		}
		if(out) return 0;
		
		
		return zahl;
		
	}
	
}
