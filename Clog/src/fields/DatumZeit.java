package fields;

import java.io.Serializable;

import datumzeit.Datum;
import datumzeit.Zeit;
import eingabeausgabe.Ausgabe;
import textangaben.Zeichen;

public class DatumZeit implements Serializable {
	private static final long serialVersionUID = 4636768504617119646L;
	private Datum datum;
	private Zeit zeit;
	
	public DatumZeit(int tag, int monat, int jahr, int stunde, int minute, int sekunde){
		datum = new Datum(tag, monat, jahr);
		zeit = new Zeit(stunde, minute, sekunde);
	}
	
	public DatumZeit(Datum datum, Zeit zeit) {
		this.datum = datum;
		this.zeit = zeit;
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

	public static DatumZeit vonEingabeEinlesen() {
		try {
			Ausgabe.print("Datum (TT.MM.JJJJ HH:MM:SS): ");
			Datum datum = Datum.vonEingabeEinlesen();
			Zeit zeit = Zeit.vonEingabeEinlesen();
			return new DatumZeit(datum, zeit);
		} catch (NumberFormatException exception) {
			Ausgabe.printline("Fehler beim Einlesen! Bitte verwenden Sie nur Zahlen im Eingabeformat: TT.MM.JJJJ HH:MM:SS (z.B. 01.01.1970 00:00:00).");
			return DatumZeit.vonEingabeEinlesen();
		} catch (ArrayIndexOutOfBoundsException exception){
			Ausgabe.printline("Fehler beim Einlesen! Bitte achten Sie auf die Vollständigkeit der Eingabe: TT.MM.JJJJ HH:MM:SS (z.B. 01.01.1970 00:00:00).");
			return DatumZeit.vonEingabeEinlesen();
		}
	}
}