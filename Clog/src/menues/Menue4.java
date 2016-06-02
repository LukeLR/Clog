package menues;

import data.DatensatzManager;
import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;
import eingabeausgabe.Path;

public class Menue4 {
	public static void menue(){
		Ausgabe.printline("Bitte geben Sie einen Dateipfad ein, an den die Datei gespeichert werden soll.");
		Path path = new Path(Eingabe.naechsterString());
		DatensatzManager.saveToFile(path);
	}
}