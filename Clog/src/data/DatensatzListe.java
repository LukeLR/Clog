package data;

import java.io.Serializable;
import java.util.ArrayList;

import eingabeausgabe.Ausgabe;
import textangaben.Schlagwort;

public class DatensatzListe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6399311921918229908L;
	private ArrayList<Datensatz> datensaetze;
	
	public DatensatzListe(){
		datensaetze = new ArrayList<Datensatz>();
	}
	
	public void datensatzHinzufuegen(Datensatz datensatz){
		datensaetze.add(datensatz);
	}
	
	public void datensaetzeMitSchlagwortAusgeben(Schlagwort schlagwort){
		for (Datensatz datensatz:datensaetze){
			datensatz.ausgebenWennEnthaeltSchlagwort(schlagwort);
		}
	}
	
	public void ausgeben(){
		Ausgabe.printline("Gebe alle Datensätze aus:");
		for (Datensatz datensatz:datensaetze){
			datensatz.ausgeben();
			Ausgabe.printline();
		}
	}
}
