package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;

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
		Ausgabe.print("Titel: ");
		Ausgabe.print(titel);
	}
	
	public int length(){
		return titel.length();
	}

	public static Titel vonEingabeEinlesen() {
		Ausgabe.print("Titel: (Beenden der Eingabe mit ';' + Enter: ");
		return new Titel(Eingabe.naechsterString(";"));
	}
}
