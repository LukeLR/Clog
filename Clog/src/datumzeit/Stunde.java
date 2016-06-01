package datumzeit;

import eingabeausgabe.Ausgabe;

public class Stunde {
	private int stunde = 0;
	
	public Stunde(int stunde){
		this.stunde = stunde;
	}
	
	public void ausgeben(){
		Ausgabe.print(stunde);
	}
}
