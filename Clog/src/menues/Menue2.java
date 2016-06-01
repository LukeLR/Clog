package menues;

import data.DatensatzListe;
import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;
import textangaben.Schlagwort;

public class Menue2 {
	public static void menue(){
		Ausgabe.print("Bitte geben Sie ein Schlagwort ein. Es werden alle Einträge mit diesem Schlagwort ausgeben.");
		Schlagwort schlagwort = new Schlagwort(Eingabe.naechsterString());
		DatensatzListe.datensaetzeMitSchlagwortAusgeben(schlagwort);
	}
}
