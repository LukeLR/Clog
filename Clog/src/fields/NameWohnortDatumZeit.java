package fields;

import java.io.Serializable;

import textangaben.Nachname;
import textangaben.Vorname;
import textangaben.Wohnort;

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
		nameWohnort = new NameWohnort(vorname, nachname, wohnort);
		this.datumZeit = datumZeit;
	}

	public void ausgeben(){
		nameWohnort.ausgeben();
		datumZeit.ausgeben();
	}
}