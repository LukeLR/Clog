package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Jahr implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3857133446770029116L;
	private int jahr = 1970;
	
	public Jahr (int jahr){
		this.jahr = jahr;
	}
	
	public void ausgeben(){
		Ausgabe.print(jahr);
	}
}
