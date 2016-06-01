package fields;

import datumzeit.Datum;
import datumzeit.Zeit;
import eingabeausgabe.Ausgabe;

public class DatumZeit {
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
}
