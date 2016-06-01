package data;

import java.util.ArrayList;

import eingabeausgabe.Ausgabe;
import textangaben.Schlagwort;

public class DatensatzListe {
	private static ArrayList<Datensatz> datensaetze = new ArrayList<Datensatz>();
	
	public DatensatzListe(){
		datensaetze = new ArrayList<Datensatz>();
	}
	
	public static void datensatzHinzufuegen(Datensatz datensatz){
		datensaetze.add(datensatz);
	}
	
	public static void datensaetzeMitSchlagwortAusgeben(Schlagwort schlagwort){
		for (Datensatz datensatz:datensaetze){
			datensatz.ausgebenWennEnthaeltSchlagwort(schlagwort);
		}
	}
	
	public static void ausgeben(){
		Ausgabe.printline("Gebe alle Datensätze aus:");
		for (Datensatz datensatz:datensaetze){
			datensatz.ausgeben();
			Ausgabe.printline();
		}
	}
}
