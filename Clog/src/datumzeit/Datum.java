package datumzeit;

import eingabeausgabe.Ausgabe;

public class Datum {
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
