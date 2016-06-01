package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Sekunde implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3954167216543580954L;
	private int sekunde = 0;
	
	public Sekunde(int sekunde){
		this.sekunde = sekunde;
	}
	
	public void ausgeben(){
		Ausgabe.print(sekunde);
	}
}
