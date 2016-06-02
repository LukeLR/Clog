package fields;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Nachname;
import textangaben.Name;
import textangaben.Vorname;
import textangaben.Wohnort;
import textangaben.Zeichen;

public class NameWohnortDatumZeit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 121958733146581230L;
	private NameWohnort nameWohnort;
	private DatumZeit datumZeit;
	
	public NameWohnortDatumZeit(String vorname, String nachname, String wohnort, int tag, int monat, int jahr, int stunde, int minute, int sekunde){
		nameWohnort = new NameWohnort(vorname, nachname, wohnort);
		datumZeit = new DatumZeit(tag, monat, jahr, stunde, minute, sekunde);
	}
	
	public NameWohnortDatumZeit(Vorname vorname, Nachname nachname, Wohnort wohnort, DatumZeit datumZeit) {
		nameWohnort = new NameWohnort(new Name(vorname, nachname), wohnort);
		this.datumZeit = datumZeit;
	}
	
	public NameWohnortDatumZeit(NameWohnort nameWohnort, DatumZeit datumZeit){
		this.nameWohnort = nameWohnort;
		this.datumZeit = datumZeit;
	}

	public void ausgeben(){
		nameWohnort.ausgeben();
		datumZeit.ausgeben();
		nameWohnort.unterstreichen(new Zeichen('='));
		datumZeit.unterstreichen(new Zeichen('='));
		Ausgabe.printline();
	}
	
	public static NameWohnortDatumZeit vonEingabeEinlesen(){
		NameWohnort nameWohnort = NameWohnort.vonEingabeEinlesen();
		DatumZeit datumZeit = DatumZeit.vonEingabeEinlesen();
		return new NameWohnortDatumZeit(nameWohnort, datumZeit);
	}
}