package fields;

import java.io.Serializable;

import datumzeit.Datum;
import datumzeit.Zeit;
import eingabeausgabe.Ausgabe;
import textangaben.Zeichen;

public class DatumZeit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4636768504617119646L;
	private Datum datum;
	private Zeit zeit;
	
	public DatumZeit(int tag, int monat, int jahr, int stunde, int minute, int sekunde){
		datum = new Datum(tag, monat, jahr);
		zeit = new Zeit(stunde, minute, sekunde);
	}
	
	public void ausgeben(){
		Ausgabe.print("Datum, Uhrzeit: ");
		datum.ausgeben();
		Ausgabe.print(" ");
		zeit.ausgeben();
		Ausgabe.printline();
	}

	public void unterstreichen(Zeichen zeichen) {
		for (int i = 0; i < "Datum, Uhrzeit: ".length(); i++){
			zeichen.ausgeben();
		}
		datum.unterstreichen(zeichen);
		zeichen.ausgeben();
		zeit.unterstreichen(zeichen);
	}
}
