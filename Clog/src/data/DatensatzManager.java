package data;

import eingabeausgabe.Ausgabe;
import eingabeausgabe.DeSerializer;
import eingabeausgabe.Path;
import textangaben.Schlagwort;

public class DatensatzManager {
	private static DatensatzListe datensaetze = new DatensatzListe();
	
	public DatensatzManager(){
		datensaetze = new DatensatzListe();
	}
	
	public static void datensatzHinzufuegen(Datensatz datensatz){
		datensaetze.datensatzHinzufuegen(datensatz);
	}
	
	public static void datensaetzeMitSchlagwortAusgeben(Schlagwort schlagwort){
		datensaetze.datensaetzeMitSchlagwortAusgeben(schlagwort);
	}
	
	public static void ausgeben(){
		datensaetze.ausgeben();
	}
	
	public static void saveToFile(Path path){
		DeSerializer<DatensatzListe> deSerializer = new DeSerializer<DatensatzListe>();
		deSerializer.writeToFile(path, datensaetze);
	}
	
	public static void readFromFile(Path path){
		DeSerializer<DatensatzListe> deSerializer = new DeSerializer<DatensatzListe>();
		datensaetze = deSerializer.readFromFile(path);
		if (datensaetze == null){
			Ausgabe.printline("Fehler beim Einlesen!");
			datensaetze = new DatensatzListe();
		}
		if (datensaetze != null){
			Ausgabe.printline("Eingelesen!");
		}
	}
}
