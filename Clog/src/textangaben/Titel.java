package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Titel implements Serializable {
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
