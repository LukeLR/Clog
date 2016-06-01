package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Jahr implements Serializable {
	private int jahr = 1970;
	
	public Jahr (int jahr){
		this.jahr = jahr;
	}
	
	public void ausgeben(){
		Ausgabe.print(jahr);
	}
}
