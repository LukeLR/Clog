package fields;

import java.io.Serializable;
import java.util.ArrayList;

import eingabeausgabe.Ausgabe;
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
}