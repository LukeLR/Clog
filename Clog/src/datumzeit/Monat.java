package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Monat implements Serializable {
	private int monat = 1;
	
	public Monat(int monat){
		this.monat = monat;
	}
	
	public void ausgeben(){
		Ausgabe.print(monat);
	}
}
