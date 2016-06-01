package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Zeichen;

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

	public void unterstreichen(Zeichen zeichen) {
		String jahrString = String.valueOf(jahr);
		for (int i = 0; i < jahrString.length(); i++){
			zeichen.ausgeben();
		}
	}
}
