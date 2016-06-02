package fields;

import java.io.Serializable;
import java.util.ArrayList;

import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;
import textangaben.Schlagwort;

public class Schlagworte implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4790018529431558406L;
	private ArrayList<Schlagwort> schlagworte;
	
	public Schlagworte(){
		schlagworte = new ArrayList<Schlagwort>();
	}
	
	public void hinzufuegen(Schlagwort schlagwort){
		schlagworte.add(schlagwort);
	}
	
	public boolean enthaelt(Schlagwort schlagwort){
		/*boolean ergebnis = false;
		for (Schlagwort tempSchlagwort:schlagworte){
			ergebnis = ergebnis || tempSchlagwort.equals(schlagwort);
		}
		return ergebnis;*/
		return schlagworte.contains(schlagwort);
	}
	
	public void ausgeben(){
		for (Schlagwort schlagwort:schlagworte){
			schlagwort.ausgeben();
			Ausgabe.print(" ");
		}
	}

	public static Schlagworte vonEingabeEinlesen() {
		Ausgabe.printline("Geben Sie nun Schlagworte ein, und bestätigen Sie nach jeder einzelnen Eingabe mit Enter. Wenn Sie keine weiteren Schlagworte eingeben wollen, geben Sie das Schlagwort 'exit' ein.");
		Schlagworte schlagworte = new Schlagworte();
		Schlagwort schlagwort = new Schlagwort(Eingabe.naechsterString());
		while (!schlagwort.equals(new Schlagwort("exit"))){
			schlagworte.hinzufuegen(schlagwort);
			schlagwort = new Schlagwort(Eingabe.naechsterString());
		}
		return schlagworte;
	}
}