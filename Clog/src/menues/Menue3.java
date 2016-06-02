package menues;

import data.DatensatzManager;
import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;
import eingabeausgabe.Path;

public class Menue3 {
	public static void menue(){
		Ausgabe.printline("Bitte geben Sie einen Dateipfad ein, von dem die Datei geladen werden soll.");
		Path path = new Path(Eingabe.naechsterString());
		DatensatzManager.readFromFile(path);
	}
}
