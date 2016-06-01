package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Schlagwort implements Serializable {
	String schlagwort;
	
	public Schlagwort(String schlagwort){
		this.schlagwort = schlagwort;
	}
	
	public void ausgeben(){
		Ausgabe.print(schlagwort);
	}
	
	public boolean equals(Schlagwort einSchlagwort){
		String schlagwort2 = einSchlagwort.schlagwort;
		return schlagwort.equals(schlagwort2);
	}
}