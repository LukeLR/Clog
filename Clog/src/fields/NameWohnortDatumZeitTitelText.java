package fields;

import java.io.Serializable;

import textangaben.Nachname;
import textangaben.Text;
import textangaben.Titel;
import textangaben.Vorname;
import textangaben.Wohnort;

public class NameWohnortDatumZeitTitelText implements Serializable {
	private static final long serialVersionUID = 9087594454259948770L;
	private NameWohnortDatumZeit nameWohnortDatumZeit;
	private TitelText titelText;
	
	public NameWohnortDatumZeitTitelText(String vorname, String nachname, String wohnort, int tag, int monat, int jahr, int stunde, int minute, int sekunde, String titel, String text){
		nameWohnortDatumZeit = new NameWohnortDatumZeit(vorname, nachname, wohnort, tag, monat, jahr, stunde, minute, sekunde);
		titelText = new TitelText(titel, text);
	}
	
	public NameWohnortDatumZeitTitelText(Vorname vorname, Nachname nachname, Wohnort wohnort, DatumZeit datumZeit, Titel titel, Text text) {
		nameWohnortDatumZeit = new NameWohnortDatumZeit(vorname, nachname, wohnort, datumZeit);
		titelText = new TitelText(titel, text);
	}
	
	public NameWohnortDatumZeitTitelText(NameWohnortDatumZeit nameWohnortDatumZeit, TitelText titelText){
		this.nameWohnortDatumZeit = nameWohnortDatumZeit;
		this.titelText = titelText;
	}

	public void ausgeben(){
		nameWohnortDatumZeit.ausgeben();
		titelText.ausgeben();
	}
	
	public static NameWohnortDatumZeitTitelText vonEingabeEinlesen(){
		NameWohnortDatumZeit nameWohnortDatumZeit = NameWohnortDatumZeit.vonEingabeEinlesen();
		TitelText titelText = TitelText.vonEingabeEinlesen();
		return new NameWohnortDatumZeitTitelText(nameWohnortDatumZeit, titelText);
	}
}
