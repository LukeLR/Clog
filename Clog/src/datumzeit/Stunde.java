package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Stunde implements Serializable {
	private int stunde = 0;
	
	public Stunde(int stunde){
		this.stunde = stunde;
	}
	
	public void ausgeben(){
		Ausgabe.print(stunde);
	}
}
