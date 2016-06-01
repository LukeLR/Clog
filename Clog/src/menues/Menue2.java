package menues;

import data.DatensatzManager;
import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;
import textangaben.Schlagwort;

public class Menue2 {
	public static void menue(){
		Ausgabe.printline("Bitte geben Sie ein Schlagwort ein. Es werden alle Einträge mit diesem Schlagwort ausgeben.");
		Schlagwort schlagwort = new Schlagwort(Eingabe.naechsterString());
		Ausgabe.print("Gebe alle Datensätze mit diesem Schlagwort aus: ");
		schlagwort.ausgeben();
		Ausgabe.printline();
		DatensatzManager.datensaetzeMitSchlagwortAusgeben(schlagwort);
		Ausgabe.printline();
	}
}
