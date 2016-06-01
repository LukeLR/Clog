package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Nachname implements Serializable {
	private String nachname = "Default Nachname";
	
	public Nachname(String nachname){
		this.nachname = nachname;
	}
	
	public void ausgeben(){
		Ausgabe.print(nachname);
	}
}
