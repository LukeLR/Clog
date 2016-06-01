package fields;

import java.io.Serializable;
import java.util.ArrayList;

import eingabeausgabe.Ausgabe;
import textangaben.Schlagwort;

public class Schlagworte implements Serializable {
	private ArrayList<Schlagwort> schlagworte;
	
	public Schlagworte(){
		schlagworte = new ArrayList<Schlagwort>();
	}
	
	public void hinzufuegen(Schlagwort schlagwort){
		schlagworte.add(schlagwort);
	}
	
	public boolean enthaelt(Schlagwort schlagwort){
		return schlagworte.contains(schlagwort);
	}
	
	public void ausgeben(){
		for (Schlagwort schlagwort:schlagworte){
			schlagwort.ausgeben();
			Ausgabe.print(" ");
		}
	}
}