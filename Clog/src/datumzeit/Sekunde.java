package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Sekunde implements Serializable {
	private int sekunde = 0;
	
	public Sekunde(int sekunde){
		this.sekunde = sekunde;
	}
	
	public void ausgeben(){
		Ausgabe.print(sekunde);
	}
}
