package textangaben;

import eingabeausgabe.Ausgabe;

public class Zeichen {
	private char zeichen;
	
	public Zeichen(char zeichen){
		this.zeichen = zeichen;
	}
	
	public void ausgeben(){
		Ausgabe.print(zeichen + "");
	}
}
