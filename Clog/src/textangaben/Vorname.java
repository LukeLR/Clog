package textangaben;

import eingabeausgabe.Ausgabe;

public class Vorname {
	private String vorname = "Default Vorname";
	
	public Vorname(String vorname){
		this.vorname = vorname;
	}
	
	public void ausgeben(){
		Ausgabe.print(vorname);
	}
}
