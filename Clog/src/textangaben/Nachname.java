package textangaben;

import eingabeausgabe.Ausgabe;

public class Nachname {
	private String nachname = "Default Nachname";
	
	public Nachname(String nachname){
		this.nachname = nachname;
	}
	
	public void ausgeben(){
		Ausgabe.print(nachname);
	}
}
