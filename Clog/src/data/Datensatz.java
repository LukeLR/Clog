package data;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import fields.DatumZeit;
import fields.NameWohnortDatumZeitTitelText;
import fields.Schlagworte;
import textangaben.Nachname;
import textangaben.Schlagwort;
import textangaben.Text;
import textangaben.Titel;
import textangaben.Vorname;
import textangaben.Wohnort;

public class Datensatz implements Serializable {
	private NameWohnortDatumZeitTitelText nameWohnortDatumZeitTitelText;
	private Schlagworte schlagworte;
	
	public Datensatz(String vorname, String nachname, String wohnort, int tag, int monat, int jahr, int stunde, int minute, int sekunde, String titel, String text){
		nameWohnortDatumZeitTitelText = new NameWohnortDatumZeitTitelText(vorname, nachname, wohnort, tag, monat, jahr, stunde, minute, sekunde, titel, text);
		schlagworte = new Schlagworte();
	}
	
	public Datensatz(Vorname vorname, Nachname nachname, Wohnort wohnort, DatumZeit datumZeit, Titel titel, Text text, Schlagworte schlagworte) {
		nameWohnortDatumZeitTitelText = new NameWohnortDatumZeitTitelText(vorname, nachname, wohnort, datumZeit, titel, text);
		this.schlagworte = schlagworte;
	}

	public void neuesSchlagwort(Schlagwort schlagwort){
		schlagworte.hinzufuegen(schlagwort);
	}
	
	public boolean enthaeltSchlagwort(Schlagwort schlagwort){
		return schlagworte.enthaelt(schlagwort);
	}
	
	public void ausgeben(){
		nameWohnortDatumZeitTitelText.ausgeben();
		Ausgabe.print("Schlagworte: ");
		schlagworte.ausgeben();
	}
	
	public void ausgebenWennEnthaeltSchlagwort(Schlagwort schlagwort){
		if (enthaeltSchlagwort(schlagwort)) ausgeben();
	}
}
