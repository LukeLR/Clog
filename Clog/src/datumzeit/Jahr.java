package datumzeit;

import eingabeausgabe.Ausgabe;

public class Jahr {
	private int jahr = 1970;
	
	public Jahr (int jahr){
		this.jahr = jahr;
	}
	
	public void ausgeben(){
		Ausgabe.print(jahr);
	}
}
