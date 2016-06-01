package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

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
}
