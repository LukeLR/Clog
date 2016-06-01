package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Datum implements Serializable {
	private Tag tag;
	private MonatJahr monatJahr;
	
	public Datum(int tag, int monat, int jahr){
		this.tag = new Tag(tag);
		monatJahr = new MonatJahr(monat, jahr);
	}
	
	public void ausgeben(){
		tag.ausgeben();
		Ausgabe.print(".");
		monatJahr.ausgeben();
	}
}
