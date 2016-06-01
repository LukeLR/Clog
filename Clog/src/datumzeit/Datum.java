package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Zeichen;

public class Datum implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2126076587376047736L;
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

	public void unterstreichen(Zeichen zeichen) {
		tag.unterstreichen(zeichen);
		zeichen.ausgeben();
		monatJahr.unterstreichen(zeichen);
	}
}
