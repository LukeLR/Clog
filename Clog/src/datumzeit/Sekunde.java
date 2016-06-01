package datumzeit;

import eingabeausgabe.Ausgabe;

public class Sekunde {
	private int sekunde = 0;
	
	public Sekunde(int sekunde){
		this.sekunde = sekunde;
	}
	
	public void ausgeben(){
		Ausgabe.print(sekunde);
	}
}
