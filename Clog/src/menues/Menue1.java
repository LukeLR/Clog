package menues;

import data.Datensatz;
import data.DatensatzManager;
import datumzeit.Datum;
import datumzeit.Zeit;
import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;
import fields.DatumZeit;
import fields.Schlagworte;
import textangaben.Nachname;
import textangaben.Schlagwort;
import textangaben.Vorname;
import textangaben.Wohnort;
import textangaben.Titel;
import textangaben.Text;

public class Menue1 {
	public static void menue(){
		Ausgabe.printline("Sie wollen einen neuen Eintrag erzeugen. Bestätigen Sie jeweils mit Enter.");
		Datensatz datensatz = Datensatz.vonEingabeEinlesen();
		DatensatzManager.datensatzHinzufuegen(datensatz);
		Ausgabe.print("Datensatz hinzugefügt.");
	}
}
