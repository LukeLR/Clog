package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Titel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4507746030320917839L;
	private String titel = "Default Titel";
	
	public Titel(String titel){
		this.titel = titel;
	}
	
	public void ausgeben(){
		Ausgabe.print(titel);
	}
	
	public int length(){
		return titel.length();
	}
}
