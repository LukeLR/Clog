package data;

import java.io.FileNotFoundException;
import java.io.IOException;

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
		try {
			deSerializer.writeToFile(path, datensaetze);
			Ausgabe.printline("Gespeichert!");
		} catch (IOException e) {
			Ausgabe.printline("Beim Zugriff auf den Speicherort ist ein Fehler aufgetreten. Stellen Sie sicher, dass der Speicherort für das Programm lesbar ist.");
		}
	}
	
	public static void readFromFile(Path path){
		DeSerializer<DatensatzListe> deSerializer = new DeSerializer<DatensatzListe>();
		try {
			datensaetze = deSerializer.readFromFile(path);
			Ausgabe.printline("Eingelesen!");
		} catch (FileNotFoundException exception){
			Ausgabe.printline("Die Datei wurde nicht gefunden! Stellen Sie sicher, dass die Datei existiert und der Speicherort richtig eingegeben wurde.");
		} catch (IOException exception) {
			Ausgabe.printline("Es gab einen Fehler beim Zugriff auf die Datei. Stellen Sie sicher, dass die Datei für das Programm lesbar ist.");
		} catch (ClassNotFoundException exception){
			Ausgabe.printline("Die Datei ist Fehlerhaft. Bitte legen Sie eine neue Datei an.");
		}
	}
}
