package datumzeit;

import eingabeausgabe.Ausgabe;

public class Monat {
	private int monat = 1;
	
	public Monat(int monat){
		this.monat = monat;
	}
	
	public void ausgeben(){
		Ausgabe.print(monat);
	}
}
