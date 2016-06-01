package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Minute implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3108808075478974908L;
	private int minute = 0;
	
	public Minute(int minute){
		this.minute = minute;
	}
	
	public void ausgeben(){
		Ausgabe.print(minute);
	}
}
