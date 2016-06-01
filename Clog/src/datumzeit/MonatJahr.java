package datumzeit;

import eingabeausgabe.Ausgabe;

public class MonatJahr {
	private Monat monat;
	private Jahr jahr;
	
	public MonatJahr(int monat, int jahr){
		this.monat = new Monat(monat);
		this.jahr = new Jahr(jahr);
	}
	
	public void ausgeben(){
		monat.ausgeben();
		Ausgabe.print(".");
		jahr.ausgeben();
	}
}
