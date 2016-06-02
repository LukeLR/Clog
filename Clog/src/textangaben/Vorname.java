package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;

public class Vorname implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6854686100533541836L;
	private String vorname = "Default Vorname";
	
	public Vorname(String vorname){
		this.vorname = vorname;
	}
	
	public void ausgeben(){
		Ausgabe.print(vorname);
	}
	
	public void unterstreichen(Zeichen zeichen){
		for (int i = 0; i < vorname.length(); i++){
			zeichen.ausgeben();
		}
	}
	
	public static Vorname vonEingabeLesen(){
		Ausgabe.print("Vorname: ");
		return new Vorname(Eingabe.naechsterString());
	}
}
