package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Stunde implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3892048434726748666L;
	private int stunde = 0;
	
	public Stunde(int stunde){
		this.stunde = stunde;
	}
	
	public void ausgeben(){
		Ausgabe.print(stunde);
	}
}
