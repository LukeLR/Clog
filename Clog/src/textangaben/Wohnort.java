package textangaben;

import eingabeausgabe.Ausgabe;

public class Wohnort {
	private String wohnort = "Default Wohnort";
	
	public Wohnort(String wohnort){
		this.wohnort = wohnort;
	}
	
	public void ausgeben(){
		Ausgabe.print(wohnort);
	}
}
