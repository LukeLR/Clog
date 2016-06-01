package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

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
}
