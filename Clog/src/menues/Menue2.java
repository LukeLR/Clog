package menues;

import data.DatensatzManager;
import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;
import textangaben.Schlagwort;

public class Menue2 {
	public static void menue(){
		Ausgabe.print("Bitte geben Sie ein Schlagwort ein. Es werden alle Eintr�ge mit diesem Schlagwort ausgeben.");
		Schlagwort schlagwort = new Schlagwort(Eingabe.naechsterString());
		DatensatzManager.datensaetzeMitSchlagwortAusgeben(schlagwort);
	}
}
