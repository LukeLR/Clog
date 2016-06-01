package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Zeichen;

public class Monat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5712186256512490453L;
	private int monat = 1;
	
	public Monat(int monat){
		this.monat = monat;
	}
	
	public void ausgeben(){
		Ausgabe.print(monat);
	}

	public void unterstreichen(Zeichen zeichen) {
		String monatString = String.valueOf(monat);
		for (int i = 0; i < monatString.length(); i++){
			zeichen.ausgeben();
		}
	}
}
