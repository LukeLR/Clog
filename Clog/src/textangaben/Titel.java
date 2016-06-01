package textangaben;

import eingabeausgabe.Ausgabe;

public class Titel {
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
