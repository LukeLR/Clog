package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Vorname implements Serializable {
	private String vorname = "Default Vorname";
	
	public Vorname(String vorname){
		this.vorname = vorname;
	}
	
	public void ausgeben(){
		Ausgabe.print(vorname);
	}
}
